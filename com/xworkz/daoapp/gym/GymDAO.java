package com.xworkz.daoapp.gym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GymDAO {
private Collection<String> gymNameCollection=new ArrayList<String>();
	
	public boolean save(String name) {
		Iterator itr=gymNameCollection.iterator();
		   while(itr.hasNext()) {
			   String tempName=(String)itr.next();
			 }
		return gymNameCollection.add(name);	
	}
	
	public boolean find(String name) {
		 Iterator<String> itr= gymNameCollection.iterator();
		 while(itr.hasNext()) {
			 String tempName=itr.next();
			 if(tempName.equals(name)) {
				 return true;
			 }
		return gymNameCollection.contains(name);
		 }
		 return false;
		
	}
	
	public boolean findByCaseInSensitive(String name) {
		Iterator <String> itr=gymNameCollection.iterator();
		    while(itr.hasNext()) {
		    	String tempName=itr.next();
		    	if(tempName.equalsIgnoreCase(name)) {
		    		return true;
		    	}
		    }
		return false;
	}
	
	public boolean findByCaseInSensitiveAndTrimmed(String name) {
		Iterator <String> itr=gymNameCollection.iterator();
	    while(itr.hasNext()) {
	    	String tempName=itr.next();
	    	if(tempName.trim()!=null) {
	    		return true;
	    	}
		
	   }
		return false;
	
	}	

}



