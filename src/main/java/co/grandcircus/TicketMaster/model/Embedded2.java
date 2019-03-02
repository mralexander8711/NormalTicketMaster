package co.grandcircus.TicketMaster.model;

import java.util.List;

public class Embedded2 {
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
