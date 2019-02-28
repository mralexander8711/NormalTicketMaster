package co.grandcircus.TicketMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventResponse {

	@JsonProperty("_embedded")
	Embed _embedded;

	public Embed getEmbed() {
		return _embedded;
	}

	public void setEmbed(Embed embed1) {
		this._embedded = embed1;
	}

	@Override
	public String toString() {
		return "EventResponse [_embedded=" + _embedded + "]";
	}

}
