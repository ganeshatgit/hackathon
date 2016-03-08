package org.tcs.hackathon.model;

import javax.xml.bind.annotation.XmlElement;

public class Categories {

	@XmlElement(nillable=true)
	private String EPAClass;
	private String market;
	private String vehicleSize;
	private String primaryBodyType;
	private String vehicleStyle;
	private String vehicleType;

	
	public String getEPAClass() {
		return EPAClass;
	}
	public void setEPAClass(String ePAClass) {
		this.EPAClass = ePAClass;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getVehicleSize() {
		return vehicleSize;
	}
	public void setVehicleSize(String vehicleSize) {
		this.vehicleSize = vehicleSize;
	}
	public String getPrimaryBodyType() {
		return primaryBodyType;
	}
	public void setPrimaryBodyType(String primaryBodyType) {
		this.primaryBodyType = primaryBodyType;
	}
	public String getVehicleStyle() {
		return vehicleStyle;
	}
	public void setVehicleStyle(String vehicleStyle) {
		this.vehicleStyle = vehicleStyle;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
}
