package co.grandcircus.TicketMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Events {

	private String id;
	@JsonProperty("name")
	private String name;
	private String url;

	private String info;
	Dates dates;
	
	@JsonProperty("priceRanges")
	List<PriceRanges> priceRanges;

	
	public List<PriceRanges> getPriceRanges() {
		return priceRanges;
	}
	public void setPriceRanges(List<PriceRanges> priceRanges) {
		this.priceRanges = priceRanges;
	}

	@JsonProperty("_embedded")
	_Embedded _embedded;
	List<Classifications> classifications;
	
	//Added with Venues attempt.
	List<Venues> venues;


	//I believe we need to reach into objects here of type venues list.
	public List<Venues> getVenues(){
		return venues;
	}
	public void setVenues(List<Venues> venues){
		this.venues=venues;
	}
	
	
	public List<Classifications> getClassifications() {
		return classifications;
	}

	public void setClassifications(List<Classifications> classifications) {
		this.classifications = classifications;
	}

	public _Embedded getEmbed2() {
		return _embedded;
	}

	public void setEmbed2(_Embedded embed2) {
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



	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", url=" + url + ", info=" + info + ", dates=" + dates
				+ ", priceRanges=" + priceRanges + ", classifications=" + classifications + ", _embedded=" + _embedded
				+ "]";
	}

}
