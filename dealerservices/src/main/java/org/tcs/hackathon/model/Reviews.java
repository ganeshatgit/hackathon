package org.tcs.hackathon.model;

public class Reviews 
{
	private Rating sales;
	private Rating service;
	public Rating getSales() {
		return sales;
	}
	public void setSales(Rating sales) {
		this.sales = sales;
	}
	public Rating getService() {
		return service;
	}
	public void setService(Rating service) {
		this.service = service;
	}
}
