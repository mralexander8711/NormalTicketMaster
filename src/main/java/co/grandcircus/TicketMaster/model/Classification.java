package co.grandcircus.TicketMaster.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Classification {

	@Override
	public String toString() {
		return "Classification [nameGenre=" + nameGenre + "]";
	}

	@JsonProperty("name")
	Genre nameGenre;

	public Genre getName() {
		return nameGenre;
	}

	public void setName(Genre nameGenre) {
		this.nameGenre = nameGenre;
	}

}
