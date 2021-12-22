package com.xworkz.streamdtoapp.river;

import java.io.Serializable;

public class RiverDTO implements Serializable {
	private Integer id;
	private String name;
	private Integer length;
	private Integer noOfDams;
	
	public RiverDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RiverDTO(Integer id, String name, Integer length, Integer noOfDams) {
		this.id = id;
		this.name = name;
		this.length = length;
		this.noOfDams = noOfDams;
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
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getNoOfDams() {
		return noOfDams;
	}
	public void setNoOfDams(Integer noOfDams) {
		this.noOfDams = noOfDams;
	}
	@Override
	public String toString() {
		return "RiverDTO [id=" + id + ", name=" + name + ", length=" + length + ", noOfDams=" + noOfDams + "]";
	}
	
	
	
	
}
