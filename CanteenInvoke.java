package com.xworkz.cloneapp.canteen;


public class CanteenInvoke {
	public static void main(String[] args) throws CloneNotSupportedException {
		CanteenDTO cd=new CanteenDTO();
		cd.setCanteenName("Basaveshwar Canteen");
		cd.setCanteenId(450);
		cd.setLocation("Mahalingpur");
		cd.setOwnerName("Raju Athani");
		cd.setContactNo(9560843217L);
		
		CanteenDTO cd1=(CanteenDTO)cd.clone();
		System.out.println(cd1);
	}

}
