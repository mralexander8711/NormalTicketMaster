package co.grandcircus.TicketMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventResponse {

	@JsonProperty("_embedded")
	_Embedded _embedded;

	List<Events> events;

	public _Embedded get_embedded() {
		return _embedded;
	}

	public void set_embedded(_Embedded _embedded) {
		this._embedded = _embedded;
	}

	public List<Events> getEvents() {
		return events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}

	public _Embedded getEmbed() {
		return _embedded;
	}

	public void setEmbed(_Embedded embed1) {
		this._embedded = embed1;
	}

	@Override
	public String toString() {
		return "EventResponse [_embedded=" + _embedded + "]";
	}

}
