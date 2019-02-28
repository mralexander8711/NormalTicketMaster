package co.grandcircus.TicketMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {

	private Long id;
	private String name;
	private String url;

	String info;
	Dates date;
	Price maxprice;

	List<Classification> classifications;

	@JsonProperty("_embedded")
	Embeds embed2;

	public List<Classification> getClassifications() {
		return classifications;
	}

	public void setClassifications(List<Classification> classifications) {
		this.classifications = classifications;
	}

	public Embeds getEmbed2() {
		return embed2;
	}

	public void setEmbed2(Embeds embed2) {
		this.embed2 = embed2;
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
		return date;
	}

	public void setDate(Dates date) {
		this.date = date;
	}

	public Price getMaxprice() {
		return maxprice;
	}

	public void setMaxprice(Price maxprice) {
		this.maxprice = maxprice;
	}

}
