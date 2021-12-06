package com.xworkz.cloneapp.showroom;


public class ShowroomInvoke {
public static void main(String[] args) throws CloneNotSupportedException {
	ShowroomDTO sd=new ShowroomDTO();
	sd.setShowroomName("Santosh Showroom");
	sd.setShowroomId(437);
	sd.setLocation("Bangalore");
	sd.setOwnerName("Hanumant Athani");
	sd.setContactNo(8976540976L);
	
	ShowroomDTO sd1=(ShowroomDTO)sd.clone();
	System.out.println(sd1);
}
}
