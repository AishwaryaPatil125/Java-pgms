package com.xworkz.cloneapp.pen;


public class PenInvoke {
	public static void main(String[] args) throws CloneNotSupportedException {
		PenDTO pd=new PenDTO();
		pd.setPenName("Writometer");
		pd.setPenId(465);
		pd.setPenPrice(20);
		pd.setColor("Black");
		pd.setThickness("1mm");
		
		PenDTO pd1=(PenDTO)pd.clone();
		System.out.println(pd1);
	}

}
