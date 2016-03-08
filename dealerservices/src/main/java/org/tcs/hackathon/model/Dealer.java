package org.tcs.hackathon.model;

public class Dealer 
{
	private String dealerId;
	private String dealerName;
	private Address dealerAddress;
	
	public String getDealerId() {
		return dealerId;
	}
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public Address getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(Address dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
}
