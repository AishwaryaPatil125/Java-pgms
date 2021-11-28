package com.xworkz.arraytostringapp;

import java.util.ArrayList;
import java.util.Collection;

public class Country {
	public static void main(String a[]){
		
		Collection collection = new ArrayList<>();
		collection.add("India");
		collection.add("Srilanka");
		collection.add("England");
		collection.add("SouthAfrica");
		collection.add("USA");
		collection.add("Pakistan");
		collection.add("China");
		
		 System.out.println(collection.size());
		    collection.toString();
		    collection.forEach(System.out::println);

	}
        
}
