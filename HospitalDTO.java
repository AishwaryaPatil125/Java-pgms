package com.xworkz.cloneapp.hospital;

public class HospitalDTO implements Cloneable {
private String hospitalName;
private int hospitalId;
private String location;
private int noOfDoctors;
private String specialization;

public String getHospitalName() {
	return hospitalName;
}
public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}
public int getHospitalId() {
	return hospitalId;
}
public void setHospitalId(int hospitalId) {
	this.hospitalId = hospitalId;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoOfDoctors() {
	return noOfDoctors;
}
public void setNoOfDoctors(int noOfDoctors) {
	this.noOfDoctors = noOfDoctors;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
@Override
public String toString() {
	return "HospitalDTO [hospitalName=" + hospitalName + ", hospitalId=" + hospitalId + ", location=" + location
			+ ", noOfDoctors=" + noOfDoctors + ", specialization=" + specialization + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
