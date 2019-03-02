package co.grandcircus.TicketMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Embedded2 {

@JsonProperty("venues")
List<Venues> venues;

public List<Venues> getVenues() {
	return venues;
}

public void setVenues(List<Venues> venues) {
	this.venues = venues;
}

@Override
public String toString() {
	return "Embedded2 [venues=" + venues + "]";
}

}
