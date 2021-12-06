package com.xworkz.cloneapp.travel;

public class TravelDTO implements Cloneable {
private String travelsName;
private String busId;
private String location;
private int noOfPassengers;
private int cost;

public String getTravelsName() {
	return travelsName;
}
public void setTravelsName(String travelsName) {
	this.travelsName = travelsName;
}
public String getBusId() {
	return busId;
}
public void setBusId(String busId) {
	this.busId = busId;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoOfPassengers() {
	return noOfPassengers;
}
public void setNoOfPassengers(int noOfPassengers) {
	this.noOfPassengers = noOfPassengers;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "TravelDTO [travelsName=" + travelsName + ", busId=" + busId + ", location=" + location + ", noOfPassengers="
			+ noOfPassengers + ", cost=" + cost + "]";
}

@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
