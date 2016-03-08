package org.tcs.hackathon.model;

public class Styles {
	
	private long id;
	private String name;
	private Submodel submodel;
	private String trim;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Submodel getSubmodel() {
		return submodel;
	}
	public void setSubmodel(Submodel submodel) {
		this.submodel = submodel;
	}
	public String getTrim() {
		return trim;
	}
	public void setTrim(String trim) {
		this.trim = trim;
	}

}
