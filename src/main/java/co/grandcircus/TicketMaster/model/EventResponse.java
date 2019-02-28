package co.grandcircus.TicketMaster.model;

import java.util.List;

public class EventResponse {

	private List<Event> events;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "EventResponse [events=" + events + "]";
	}

}
