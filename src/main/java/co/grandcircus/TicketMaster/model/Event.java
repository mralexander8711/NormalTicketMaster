package co.grandcircus.TicketMaster.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {

	private Long id;
	private String name;

	@JsonProperty("priceRanges/max")
	private Integer price;

	@JsonProperty("classfications/genre/name")
	private String genre;

	@JsonProperty("_embedded/venues/name")
	private String venue;

	@JsonProperty("dates/start/localTime")
	private String date;

	private String url;

	@JsonProperty("_embedded/venues/postalCode")
	private String zip;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
