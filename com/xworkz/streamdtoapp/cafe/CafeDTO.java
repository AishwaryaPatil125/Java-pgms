package com.xworkz.streamdtoapp.cafe;

import java.io.Serializable;

public class CafeDTO implements Serializable {
private int id;
private String name;
private String location;
private float rating;


public CafeDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public CafeDTO(int id, String name, String location, float rating) {
	this.id = id;
	this.name = name;
	this.location = location;
	this.rating = rating;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}

@Override
public String toString() {
	return "CafeDTO [id=" + id + ", name=" + name + ", location=" + location + ", rating=" + rating + "]";
}




}
