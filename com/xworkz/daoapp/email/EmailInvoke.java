package com.xworkz.daoapp.email;

public class EmailInvoke {
	public static void main(String[] args) {
		
		
		EmailDAO dao = new EmailDAO();
		dao.save("patilaishwarya313@gmail.com");
		dao.save("aishwaryapatil125@gmail.in");
		
		EmailSearch email =new EmailSearchByCom();
		boolean found = dao.find(email,"patilaishwarya313@gmail.com");
		System.out.println(found);
		
		EmailSearch email1=new EmailSearchByIn();
		boolean found1=dao.find(email1,"aishwaryapatil125@gmail.in");
		System.out.println(found1);
		
		EmailSearch email2=new EmailSearchByMail();
		boolean found2=dao.find(email2, "patilaishwarya313@gmail.com");
		System.out.println(found2);
		
		}

}





