package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryInvoke {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("India",91);
	    map.put("Uganda",256);
	    map.put("Turkey",90);
	    map.put("Sweden",46);
	    map.put("Saudi",966);
	    
	    System.out.println(map.size());
	    Integer value=(Integer) map.get("India");
	    System.out.println(value);
	    
	    boolean contains=map.containsKey("Pak");
	    System.out.println(contains);
	    
	    contains=map.containsValue(256);
	    System.out.println(contains);
	    
	    Set<String> keys=map.keySet();
	    
	    keys.forEach((e)->{
	    	System.out.println(e);
	    });
	    
	    
	    
	}

}
