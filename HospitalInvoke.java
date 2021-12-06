package com.xworkz.cloneapp.hospital;

public class HospitalInvoke {
public static void main(String[] args) throws CloneNotSupportedException {
	HospitalDTO hd=new HospitalDTO();
	hd.setHospitalName("Sadana Hospital");
	hd.setHospitalId(654);
	hd.setLocation("Mudhol");
	hd.setNoOfDoctors(20);
	hd.setSpecialization("Children Specialist");
	
	HospitalDTO hd1=(HospitalDTO)hd.clone();
	System.out.println(hd1);
}
}
