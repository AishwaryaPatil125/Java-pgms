package com.xworkz.daoapp.ipl;

public class IPLInvoke {
	public static void main(String[] args) {
		String teamName="RCB";
		teamName=teamName.replace("", "");
		System.out.println(teamName);
		
		IPLDAO dao = new IPLDAO();
		dao.save("RCB");
		dao.save("CSK");
		dao.save("MI");
		dao.save("RR");
		dao.save("DC");
		
		boolean found = dao.find("RCB");
		System.out.println(found);
		
		found=dao.findByCaseInSensitive("rcb");
		System.out.println(found);
		
		found=dao.findByCaseInSensitiveAndTrimmed("r c b");
		System.out.println(found);
		
	}

}



