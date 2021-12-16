package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContinentInvoke {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("Africa",54);
	    map.put("Asia",49);
	    map.put("Europe",51);
	    map.put("North America",23);
	    map.put("Oceania",14);
	    
	    System.out.println(map.size());
	    Integer value=(Integer) map.get("Europe");
	    System.out.println(value);
	    
	    boolean contains=map.containsKey("Asia");
	    System.out.println(contains);
	    
	    contains=map.containsValue(14);
	    System.out.println(contains);
	    
	    Set<String> keys=map.keySet();
	    
	    keys.forEach((e)->{
	    	System.out.println(e);
	    });
	    
	    
	    
	}

}



