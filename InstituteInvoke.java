package com.xworkz.cloneapp.institute;

public class InstituteInvoke {
public static void main(String[] args) throws CloneNotSupportedException {
	InstituteDTO id=new InstituteDTO();
	id.setInstituteName("Xworkz");
	id.setInstituteId(260);
	id.setLocation("Bangalore");
	id.setNoOfTrainers(1000);
	id.setFees(20000);
	
	InstituteDTO id1=(InstituteDTO)id.clone();
	System.out.println(id1);
}
}
