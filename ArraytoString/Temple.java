package com.xworkz.arraytostringapp;

import java.util.ArrayList;
import java.util.Collection;

public class Temple {
	public static void main(String a[]){
		
		Collection collection = new ArrayList<>();
		collection.add("Virupaksha");
		collection.add("Annpurneshwari");
		collection.add("Krishna");
		
		
		 System.out.println(collection.size());
		    collection.toString();
		    collection.forEach(System.out::println);

		
		
		}

}
