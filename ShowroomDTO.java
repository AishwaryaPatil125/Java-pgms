package com.xworkz.cloneapp.showroom;

public class ShowroomDTO implements Cloneable {
	private String showroomName;
	private int showroomId;
	private String location;
	private String ownerName;
	private  long contactNo;
	
	public String getShowroomName() {
		return showroomName;
	}
	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}
	public int getShowroomId() {
		return showroomId;
	}
	public void setShowroomId(int showroomId) {
		this.showroomId = showroomId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "ShowroomDTO [showroomName=" + showroomName + ", showroomId=" + showroomId + ", location=" + location
				+ ", ownerName=" + ownerName + ", contactNo=" + contactNo + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
