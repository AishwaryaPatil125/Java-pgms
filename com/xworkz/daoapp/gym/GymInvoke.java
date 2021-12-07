package com.xworkz.daoapp.gym;

public class GymInvoke {
	public static void main(String[] args) {
		String gymName="Fitness Frenzy";
		gymName=gymName.replace("", "");
		System.out.println(gymName);
		
		GymDAO dao = new GymDAO();
		dao.save("Fitness Frenzy");
		dao.save("Golds Gym");
		dao.save("Silhouette Fitness");
		dao.save("Fitness Race");
		dao.save("Snap Fitness");
		
		boolean found = dao.find("Fitness Frenzy");
		System.out.println(found);
		
		found=dao.findByCaseInSensitive("fitness frenzy");
		System.out.println(found);
		
		found=dao.findByCaseInSensitiveAndTrimmed("fitnessfrenzy");
		System.out.println(found);
		
	}

}



