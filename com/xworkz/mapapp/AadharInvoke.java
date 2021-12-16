package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AadharInvoke {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("Aishwarya",910824578901L);
	    map.put("Sanjana",546714560987L);
	    map.put("Vidya",908764390987L);
	    map.put("Anu",8907652345678L);
	    map.put("Akshata",966879046340L);
	    
	    System.out.println(map.size());
	    Long value=(Long) map.get("Akshata");
	    System.out.println(value);
	    
	    boolean contains=map.containsKey("Aishwarya");
	    System.out.println(contains);
	    
	    contains=map.containsValue(908764390987L);
	    System.out.println(contains);
	    
	    Set<String> keys=map.keySet();
	    
	    keys.forEach((e)->{
	    	System.out.println(e);
	    });
	    
	    
	    
	}

}



