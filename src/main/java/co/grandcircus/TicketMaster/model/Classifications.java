package co.grandcircus.TicketMaster.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Classifications {

	@Override
	public String toString() {
		return "Classification [nameGenre=" + name + "]";
	}

	@JsonProperty("name")
	Genre name;

	public Genre getName() {
		return name;
	}

	public void setName(Genre nameGenre) {
		this.name = nameGenre;
	}

}
