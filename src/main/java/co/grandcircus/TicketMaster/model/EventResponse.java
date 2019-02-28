package co.grandcircus.TicketMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventResponse {

	@JsonProperty("_embedded")
	List<Embed> embed1;

	public List<Embed> getEmbed1() {
		return embed1;
	}

	public void setEmbed1(List<Embed> embed1) {
		this.embed1 = embed1;
	}

}
