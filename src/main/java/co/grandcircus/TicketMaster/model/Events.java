package co.grandcircus.TicketMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Events {

	private String id;
	@JsonProperty("name")
	private String name;
	private String url;

	private String info;

	
	@JsonProperty("_embedded")
	Embedded2 embedded2;
	List<Venues> venues;
	
	
	public List<Venues> getVenues() {
		return venues;
	}

	public void setVenues(List<Venues> venues) {
		this.venues = venues;
	}

	public Embedded2 getEmbedded2() {
		return embedded2;
	}

	public void setEmbedded2(Embedded2 embedded2) {
		this.embedded2 = embedded2;
	}

	public Embedded2 getEmbeded2() {
		return embedded2;
	}

	public void setEmbeded2(Embedded2 embeded2) {
		this.embedded2 = embeded2;
	}

	@JsonProperty("classifications")
	List<Classifications> classifications;

	public List<Classifications> getClassifications() {
		return classifications;
	}

	public void setClassifications(List<Classifications> classifications) {
		this.classifications = classifications;
	}

	@JsonProperty("images")
	List<Images> images;
	
	
	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	@JsonProperty("priceRanges")
	List<PriceRanges> priceRanges;

	public List<PriceRanges> getPriceRanges() {
		return priceRanges;
	}

	public void setPriceRanges(List<PriceRanges> priceRanges) {
		this.priceRanges = priceRanges;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nameEvent) {
		this.name = nameEvent;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Event id=" + id + ", name=" + name + ", url=" + url + ", info=" + info;
	}

}
