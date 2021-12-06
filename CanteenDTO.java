package com.xworkz.cloneapp.canteen;

public class CanteenDTO implements Cloneable {
	private String canteenName;
	private String location;
	private int canteenId;
	private String ownerName;
	private long contactNo;
	
	public String getCanteenName() {
		return canteenName;
	}
	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCanteenId() {
		return canteenId;
	}
	public void setCanteenId(int canteenId) {
		this.canteenId = canteenId;
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
		return "CanteenDTO [canteenName=" + canteenName + ", location=" + location + ", canteenId=" + canteenId
				+ ", ownerName=" + ownerName + ", contactNo=" + contactNo + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
