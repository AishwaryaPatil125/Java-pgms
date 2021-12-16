package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyboardInvoke {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("AT",84);
	    map.put("Windows",104);
	    map.put("Apple",109);
	    map.put("MacBook",78);
	    map.put("AT Enchanced",101);
	    
	    System.out.println(map.size());
	    Integer value=(Integer) map.get("Windows");
	    System.out.println(value);
	    
	    boolean contains=map.containsKey("MacBook");
	    System.out.println(contains);
	    
	    contains=map.containsValue(84);
	    System.out.println(contains);
	    
	    Set<String> keys=map.keySet();
	    
	    keys.forEach((e)->{
	    	System.out.println(e);
	    });
	    
	    
	    
	}

}





