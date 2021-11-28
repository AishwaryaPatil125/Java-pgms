package com.xworkz.arraytostringapp;

import java.util.ArrayList;
import java.util.Collection;

public class ShoppingMall {
	public static void main(String a[]){
		
		Collection collection = new ArrayList<>();
		collection.add("Mantri");
		collection.add("Orion");
		collection.add("VR");
		collection.add("Phoneix");
		
		 System.out.println(collection.size());
		    collection.toString();
		    collection.forEach(System.out::println);

		}
}
