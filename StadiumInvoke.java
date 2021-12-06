package com.xworkz.cloneapp.stadium;

public class StadiumInvoke {
	public static void main(String[] args) throws CloneNotSupportedException {
		StadiumDTO sd=new StadiumDTO();
		sd.setStadiumName("Kempegouda Stadium");
		sd.setStadiumId(11);
		sd.setLocation("Bangalore");
		sd.setNoOfSeats(1000);
		sd.setEntryTicket(700);
		
		StadiumDTO sd1=(StadiumDTO)sd.clone();
		System.out.println(sd1);
	}

}
