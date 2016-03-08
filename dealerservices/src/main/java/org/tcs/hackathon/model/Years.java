package org.tcs.hackathon.model;

import java.util.List;

public class Years {
	
	private long id;
	private int year;
	private List<Styles> styles;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Styles> getStyles() {
		return styles;
	}
	public void setStyles(List<Styles> styles) {
		this.styles = styles;
	}

}
