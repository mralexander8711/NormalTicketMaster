package co.grandcircus.TicketMaster.model;

import java.util.List;

public class Embed {

	private List<Event> events;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Embed [events=" + events + "]";
	}

}
