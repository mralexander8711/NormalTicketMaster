package co.grandcircus.TicketMaster.model;

public class PriceRanges {
	private Double max;
	private Double min;
	
	
	
	public Double getMax() {
		return max;
	}
	public void setMax(Double max) {
		this.max = max;
	}
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
	@Override
	public String toString() {
		return "PriceRanges [max=" + max + ", min=" + min + "]";
	}
	
}
