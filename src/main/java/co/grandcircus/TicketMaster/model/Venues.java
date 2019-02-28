package co.grandcircus.TicketMaster.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Venues {
	@JsonProperty("name")
	String name;
	String postalCode;
	public String getNameVenue() {
		return name;
	}
	public void setNameVenue(String name) {
		this.name = name;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Venues [name=" + name + ", postalCode=" + postalCode + "]";
	}

}
