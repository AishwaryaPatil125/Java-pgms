package com.xworkz.streamdtoapp.temple;

import java.io.Serializable;

public class TempleDTO implements Serializable {
private Integer id;
private String name;
private String location;
private String mainGod;
private Integer visitorsPerDay;

public TempleDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public TempleDTO(Integer id, String name, String location, String mainGod, Integer visitorsPerDay) {
	this.id = id;
	this.name = name;
	this.location = location;
	this.mainGod = mainGod;
	this.visitorsPerDay = visitorsPerDay;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
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

public String getMainGod() {
	return mainGod;
}

public void setMainGod(String mainGod) {
	this.mainGod = mainGod;
}

public Integer getVisitorsPerDay() {
	return visitorsPerDay;
}

public void setVisitorsPerDay(Integer visitorsPerDay) {
	this.visitorsPerDay = visitorsPerDay;
}

@Override
public String toString() {
	return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", mainGod=" + mainGod
			+ ", visitorsPerDay=" + visitorsPerDay + "]";
}

}
