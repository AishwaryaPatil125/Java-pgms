package com.xworkz.cloneapp.stadium;

public class StadiumDTO implements Cloneable {
	private String stadiumName;
	private int stadiumId;
	private String location;
	private int noOfSeats;
	private int entryTicket;
	
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public int getStadiumId() {
		return stadiumId;
	}
	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getEntryTicket() {
		return entryTicket;
	}
	public void setEntryTicket(int entryTicket) {
		this.entryTicket = entryTicket;
	}
	@Override
	public String toString() {
		return "StadiumDTO [stadiumName=" + stadiumName + ", stadiumId=" + stadiumId + ", location=" + location
				+ ", noOfSeats=" + noOfSeats + ", entryTicket=" + entryTicket + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
