package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlanetInvoke {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("Jupiter",79);
	    map.put("Saturn",82);
	    map.put("Uranus",27);
	    map.put("Neptune",14);
	    map.put("Pluto",5);
	    
	    System.out.println(map.size());
	    Integer value=(Integer) map.get("Pluto");
	    System.out.println(value);
	    
	    boolean contains=map.containsKey("Earth");
	    System.out.println(contains);
	    
	    contains=map.containsValue(82);
	    System.out.println(contains);
	    
	    Set<String> keys=map.keySet();
	    
	    keys.forEach((e)->{
	    	System.out.println(e);
	    });
	    
	    
	    
	}

}



