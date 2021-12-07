package com.xworkz.daoapp.ipl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IPLDAO {
private Collection<String> teamNameCollection=new ArrayList<String>();
	
	public boolean save(String name) {
		Iterator itr=teamNameCollection.iterator();
		   while(itr.hasNext()) {
			   String tempName=(String)itr.next();
			 }
		return teamNameCollection.add(name);	
	}
	
	public boolean find(String name) {
		 Iterator<String> itr= teamNameCollection.iterator();
		 while(itr.hasNext()) {
			 String tempName=itr.next();
			 if(tempName.equals(name)) {
				 return true;
			 }
		return teamNameCollection.contains(name);
		 }
		 return false;
		
	}
	
	public boolean findByCaseInSensitive(String name) {
		Iterator <String> itr=teamNameCollection.iterator();
		    while(itr.hasNext()) {
		    	String tempName=itr.next();
		    	if(tempName.equalsIgnoreCase(name)) {
		    		return true;
		    	}
		    }
		return false;
	}
	
	public boolean findByCaseInSensitiveAndTrimmed(String name) {
		Iterator <String> itr=teamNameCollection.iterator();
	    while(itr.hasNext()) {
	    	String tempName=itr.next();
	    	if(tempName.trim()!=null) {
	    		return true;
	    	}
		
	   }
		return false;
	
	}	

}



