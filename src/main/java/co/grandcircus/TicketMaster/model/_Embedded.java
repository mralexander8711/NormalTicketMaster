package co.grandcircus.TicketMaster.model;

import java.util.List;

public class _Embedded {

	private List<Events> events;

	public List<Events> getEvents() {
		return events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Embed [events=" + events + "]";
	}

}
