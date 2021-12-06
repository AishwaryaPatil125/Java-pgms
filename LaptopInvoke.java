package com.xworkz.cloneapp.laptop;

public class LaptopInvoke {
	public static void main(String[] args) throws CloneNotSupportedException {
		LaptopDTO ld=new LaptopDTO();
		ld.setLaptopName("Lenovo");
		ld.setLaptopId(125);
		ld.setPrice(40000);
		ld.setStorage("1TB");
		ld.setColor("Silver");
		
		LaptopDTO ld1=(LaptopDTO)ld.clone();
		System.out.println(ld1);
  }
}
