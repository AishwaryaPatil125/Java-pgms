package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LaptopInvoke {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("Lenovo","80MG");
	    map.put("Acer","ZG5");
	    map.put("Dell","PP26L");
	    map.put("Asus","A6Q00VA24M");
	    map.put("Apple","MF839**/A");
	    
	    System.out.println(map.size());
	    String value= (String) map.get("Lenovo");
	    System.out.println(value);
	    
	    boolean contains=map.containsKey("Asus");
	    System.out.println(contains);
	    
	    contains=map.containsValue("ZG5");
	    System.out.println(contains);
	    
	    Set<String> keys=map.keySet();
	    
	    keys.forEach((e)->{
	    	System.out.println(e);
	    });
	    
	    
	    
	}

}



