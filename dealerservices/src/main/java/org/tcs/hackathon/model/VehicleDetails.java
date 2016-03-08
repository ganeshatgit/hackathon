package org.tcs.hackathon.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VehicleDetails 
{
	private Make make;
	private Make model;
	private String drivenWheels;
	private String numOfDoors;
	private String[] options;
	private String[] colors;
	private String manufacturerCode;
	private Price price;
	private Categories categories;
	private String vin;
	private String squishVin;
	private List<Years> years;
	private String matchingType;
	
	@XmlElement(nillable=true)
	private MPG MPG;
	
	public MPG getMPG() {
		return MPG;
	}
	public void setMPG(MPG mPG) {
		this.MPG = mPG;
	}
	public Make getMake() {
		return make;
	}
	public void setMake(Make make) {
		this.make = make;
	}
	public Make getModel() {
		return model;
	}
	public void setModel(Make model) {
		this.model = model;
	}
	public String getDrivenWheels() {
		return drivenWheels;
	}
	public void setDrivenWheels(String drivenWheels) {
		this.drivenWheels = drivenWheels;
	}
	public String getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(String numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public String[] getColors() {
		return colors;
	}
	public void setColors(String[] colors) {
		this.colors = colors;
	}
	public String getManufacturerCode() {
		return manufacturerCode;
	}
	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getSquishVin() {
		return squishVin;
	}
	public void setSquishVin(String squishVin) {
		this.squishVin = squishVin;
	}
	public List<Years> getYears() {
		return years;
	}
	public void setYears(List<Years> years) {
		this.years = years;
	}
	public String getMatchingType() {
		return matchingType;
	}
	public void setMatchingType(String matchingType) {
		this.matchingType = matchingType;
	}
	
}