package com.xworkz.cloneapp.bottle;

public class BottleDTO implements Cloneable {
	private String bottleName;
	private int bottleId;
	private String color;
	private int price;
	private String capacity;
	public String getBottleName() {
		return bottleName;
	}
	public void setBottleName(String bottleName) {
		this.bottleName = bottleName;
	}
	public int getBottleId() {
		return bottleId;
	}
	public void setBottleId(int bottleId) {
		this.bottleId = bottleId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "BottleDTO [bottleName=" + bottleName + ", bottleId=" + bottleId + ", color=" + color + ", price="
				+ price + ", capacity=" + capacity + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
