package co.grandcircus.TicketMaster.model;

public class Start {
	
	private String localTime;
	private String localDate;
	
	public String getLocalTime() {
		return localTime;
	}
	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}
	public String getLocalDate() {
		return localDate;
	}
	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}
	@Override
	public String toString() {
		return "Start [localTime=" + localTime + ", localDate=" + localDate + "]";
	}
	
}
