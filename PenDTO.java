package com.xworkz.cloneapp.pen;

public class PenDTO implements Cloneable {
private String penName;
private int penId;
private int penPrice;
private String color;
private String thickness;

public String getPenName() {
	return penName;
}
public void setPenName(String penName) {
	this.penName = penName;
}
public int getPenId() {
	return penId;
}
public void setPenId(int penId) {
	this.penId = penId;
}
public int getPenPrice() {
	return penPrice;
}
public void setPenPrice(int penPrice) {
	this.penPrice = penPrice;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getThickness() {
	return thickness;
}
public void setThickness(String thickness) {
	this.thickness = thickness;
}
@Override
public String toString() {
	return "PenDTO [penName=" + penName + ", penId=" + penId + ", penPrice=" + penPrice + ", color=" + color
			+ ", thickness=" + thickness + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
