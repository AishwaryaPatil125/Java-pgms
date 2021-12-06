package com.xworkz.cloneapp.mobile;

public class MobileInvoke {
	public static void main(String[] args) throws CloneNotSupportedException {
		MobileDTO md=new MobileDTO();
		md.setBrand("Lava");
		md.setColor("Black");
		md.setModelNo("Z90");
		md.setStorage(500);
		md.setPrice(15000);
		
		MobileDTO md1=(MobileDTO)md.clone();
		System.out.println(md1);
		
	}

}
