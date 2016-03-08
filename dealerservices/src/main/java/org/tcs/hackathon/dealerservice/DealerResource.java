package org.tcs.hackathon.dealerservice;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.tcs.hackathon.model.Address;
import org.tcs.hackathon.model.ContactInfo;
import org.tcs.hackathon.model.Dealers;
import org.tcs.hackathon.model.DealershipDetails;
import org.tcs.hackathon.model.Operations;
import org.tcs.hackathon.model.Rating;
import org.tcs.hackathon.model.Reviews;
import org.tcs.hackathon.model.VehicleDetails;
@Path("/")
public class DealerResource 
{
	
	public static final String VEHICLE_API_BASE_URI = "https://api.edmunds.com/api/vehicle/v2/vins";
	public static final String DEALER_API_BASE_URI = "https://api.edmunds.com/api/dealer/v2/dealers";
	public static final String API_KEY = "b7vusrwh6awejqke5jpc6emb";	
	@Path("/dealers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public DealershipDetails getDealer(@QueryParam("vin") String vin, @QueryParam("zipcode") int zipcode)
	{
		System.out.println(vin);
		DealershipDetails dealershipDetails = null;
		VehicleDetails vehicleDetails = getVehicleDetails(vin);
		if(vehicleDetails != null)
		{
			dealershipDetails = getDealershipDetails(zipcode, vehicleDetails);
			dealershipDetails.setVehicleDetails(vehicleDetails);
		}
		return dealershipDetails;
	}
	
	private VehicleDetails getVehicleDetails(String vin)
	{
		VehicleDetails vehicleDetails = null;
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(VEHICLE_API_BASE_URI);
		Response response = target.path(vin).queryParam("fmt", "json").queryParam("api_key", API_KEY).request(MediaType.APPLICATION_JSON).get();
		System.out.println(response);
		System.out.println(response.getStatus());
		if(response.getStatus()==200)
		{	
			vehicleDetails = response.readEntity(VehicleDetails.class);
			System.out.println(vehicleDetails.getMake().getName());
		}
		return vehicleDetails;
	}
	
	private DealershipDetails mockDealerDetails(DealershipDetails dealershipDetails) 
	{
		Address address = new Address();
		address.setStreet("1020 Santa Monica Blvd");
		address.setCity("Santa Monica");
        address.setStateCode("CA");
        address.setStateName("California");
        address.setCounty("Los Angeles");
        address.setCountry("USA");
        address.setLatitude(34.021211);
        address.setLongitude(-118.489241);
        address.setZipcode("90401");
        
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setPhone("(888) 479-8692");
        contactInfo.setWebsite("http://www.santamonicaaudica.com");
        contactInfo.setGpContactFirstName("Harlan");
        contactInfo.setGpContactLastName("Seyton");
        contactInfo.setGpContactEmail("harlans@santamonicaaudi.com");
        contactInfo.setGpCommitment("Text us at 310-484-5356 for exclusive offers.|Upfront Pricing: Upfront Guaranteed Pricing|We promise world class service and an expedited shopping experience. Any day free car washes for purchased vehicles.");
        contactInfo.setGpPhone("(888) 479-8692");
        
        Operations operations = new Operations();
        operations.setWednesday("09:00 AM-08:00 PM");
        operations.setThursday("09:00 AM-08:00 PM");
        operations.setTuesday("09:00 AM-08:00 PM");
        operations.setSaturday("09:00 AM-07:00 PM");
        operations.setFriday("09:00 AM-08:00 PM");
        operations.setMonday("09:00 AM-08:00 PM");
        operations.setSunday("10:00 AM-06:00 PM");
        
        Rating sales = new Rating();
        sales.setCount(18);
        sales.setNotRecommendedCount(1);
        sales.setOverallRating(4);
        sales.setRecommendedCount(4);
        Reviews reviews = new Reviews();
        reviews.setSales(sales);
        reviews.setService(sales);
        	
		Dealers dealers = new Dealers();
		dealers.setActive(true);
		dealers.setAddress(address);
		dealers.setContactInfo(contactInfo);
		dealers.setDealerId("879");
		dealers.setDistance(1.2034900794357524);
		dealers.setName("Santa Monica Audi");
		dealers.setNiceName("SantaMonicaAudi");
		dealers.setOperations(operations);
		dealers.setReviews(reviews);
		dealers.setStates(new String[] {"USED", "NEW"});
		dealers.setType("ROOFTOP");
		List<Dealers> dealerList = new ArrayList();
		dealerList.add(dealers);
		dealershipDetails.setDealers(dealerList);
		return dealershipDetails;
	}

	private DealershipDetails getDealershipDetails(int zipcode, VehicleDetails vehicleDetails)
	{
		DealershipDetails dealershipDetails = null;
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(DEALER_API_BASE_URI);
		Response response = target.queryParam("zipcode", zipcode).queryParam("radius", 20)
				.queryParam("make", vehicleDetails.getMake().getName()).queryParam("state", "new")
				.queryParam("pageNum", 1).queryParam("pageSize", 10).queryParam("sortby", "distance:ASC")
				.queryParam("view", "basic").queryParam("api_key", API_KEY).request(MediaType.APPLICATION_JSON).get();
		System.out.println(response.getStatus());
		if(response.getStatus()==200)
		{	
//			dealershipDetails = response.readEntity(DealershipDetails.class);
			dealershipDetails = mockDealerDetails(new DealershipDetails());
			System.out.println(dealershipDetails.getDealers().get(0).getName());
		}
		return dealershipDetails;

	}
}
