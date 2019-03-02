package co.grandcircus.TicketMaster.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Classifications {
	
	@JsonProperty("genre")
	private Genre genre;

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Classifications [genre=" + genre + "]";
	}
}
