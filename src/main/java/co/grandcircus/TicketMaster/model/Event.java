package co.grandcircus.TicketMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {

	private String id;
	@JsonProperty("name")
	private String name;
	private String url;

	private String info;
	Dates dates;
	PriceRanges priceRanges;

	List<Classification> classifications;

	@JsonProperty("_embedded")
	Embeds _embedded;

	public List<Classification> getClassifications() {
		return classifications;
	}

	public void setClassifications(List<Classification> classifications) {
		this.classifications = classifications;
	}

	public Embeds getEmbed2() {
		return _embedded;
	}

	
	

	public void setEmbed2(Embeds embed2) {
		this._embedded = embed2;
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

	public Dates getDate() {
		return dates;
	}

	public void setDate(Dates date) {
		this.dates = date;
	}

	public PriceRanges getMaxprice() {
		return priceRanges;
	}

	public void setMaxprice(PriceRanges maxprice) {
		this.priceRanges = maxprice;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", url=" + url + ", info=" + info + ", dates=" + dates
				+ ", priceRanges=" + priceRanges + ", classifications=" + classifications + ", _embedded=" + _embedded
				+ "]";
	}

}
