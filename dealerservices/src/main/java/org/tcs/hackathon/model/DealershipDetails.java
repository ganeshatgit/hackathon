package org.tcs.hackathon.model;

import java.util.List;

public class DealershipDetails 
{
	private List<Dealers> dealers;
	private VehicleDetails vehicleDetails;
	
	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public List<Dealers> getDealers() {
		return dealers;
	}

	public void setDealers(List<Dealers> dealers) {
		this.dealers = dealers;
	}
	
}
