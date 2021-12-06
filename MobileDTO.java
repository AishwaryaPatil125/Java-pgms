package com.xworkz.cloneapp.mobile;

public class MobileDTO implements Cloneable {
  private String brand;
  private int price;
  private String color;
  private int storage;
  private String modelNo;

  public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getStorage() {
	return storage;
}
public void setStorage(int storage) {
	this.storage = storage;
}
public String getModelNo() {
	return modelNo;
}
public void setModelNo(String modelNo) {
	this.modelNo = modelNo;
}
@Override
public String toString() {
	return "MobileDTO [brand=" + brand + ", price=" + price + ", color=" + color + ", storage=" + storage + ", modelNo="
			+ modelNo + "]";
}
@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
  
}
