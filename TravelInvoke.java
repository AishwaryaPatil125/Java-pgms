package com.xworkz.cloneapp.travel;

public class TravelInvoke {
	public static void main(String[] args) throws CloneNotSupportedException {
		TravelDTO td=new TravelDTO();
		td.setTravelsName("SRS Travels");
		td.setBusId("KA 02 M 1234");
		td.setLocation("Bagalkot");
		td.setNoOfPassengers(25);
		td.setCost(2000);
		
		TravelDTO td1=(TravelDTO)td.clone();
		System.out.println(td1);
	}

}
