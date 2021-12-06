package com.xworkz.cloneapp.institute;

public class InstituteDTO implements Cloneable {
private String instituteName;
private int instituteId;
private String location;
private int noOfTrainers;
private int fees;

public String getInstituteName() {
	return instituteName;
}
public void setInstituteName(String instituteName) {
	this.instituteName = instituteName;
}
public int getInstituteId() {
	return instituteId;
}
public void setInstituteId(int instituteId) {
	this.instituteId = instituteId;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoOfTrainers() {
	return noOfTrainers;
}
public void setNoOfTrainers(int noOfTrainers) {
	this.noOfTrainers = noOfTrainers;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "InstituteDTO [instituteName=" + instituteName + ", instituteId=" + instituteId + ", location=" + location
			+ ", noOfTrainers=" + noOfTrainers + ", fees=" + fees + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
