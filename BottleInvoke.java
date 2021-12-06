package com.xworkz.cloneapp.bottle;


public class BottleInvoke {
public static void main(String[] args) throws CloneNotSupportedException {
	BottleDTO bd=new BottleDTO();
	bd.setBottleName("Tupperware");
	bd.setBottleId(678);
	bd.setPrice(200);
	bd.setColor("Blue");
	bd.setCapacity("1L");
	
	BottleDTO bd1=(BottleDTO)bd.clone();
	System.out.println(bd1);
}
}
