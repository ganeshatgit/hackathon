package org.tcs.hackathon.model;

public class Dealers {

	private boolean active;
	private String preferences;
	private String dealerId;
	private String name;
	private String niceName;
	private double distance;
	private Operations operations;
	private Address address;
	private ContactInfo contactInfo;
	private Reviews reviews;
	private String[] states;
	private String type;
	
	public String getPreferences() {
		return preferences;
	}
	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getDealerId() {
		return dealerId;
	}
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNiceName() {
		return niceName;
	}
	public void setNiceName(String niceName) {
		this.niceName = niceName;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Operations getOperations() {
		return operations;
	}
	public void setOperations(Operations operations) {
		this.operations = operations;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public Reviews getReviews() {
		return reviews;
	}
	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}
	public String[] getStates() {
		return states;
	}
	public void setStates(String[] states) {
		this.states = states;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
