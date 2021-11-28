package com.xworkz.arraytostringapp;

import java.util.ArrayList;
import java.util.Collection;

public class Airport {
	
	public static void main(String a[]){
		
		Collection collection = new ArrayList<>();
		collection.add("SpiceJet");
		collection.add("Indigo");
		collection.add("AirIndia");
		
		
		 System.out.println(collection.size());
		    collection.toString();
		    collection.forEach(System.out::println);
	}
		
}
