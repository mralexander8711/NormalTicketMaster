package co.grandcircus.TicketMaster.model;

import java.util.List;

public class Embed {

	private List<Venues> venues;

	public List<Venues> getVenues() {
		return venues;
	}

	public void setVenues(List<Venues> venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		return "Embeds [venues=" + venues + "]";
	}

}
