package com.xworkz.shopapp;
import java.util.*;

import com.xworkz.shopapp.Shop;
import com.xworkz.shopapp.dto.ElectronicGadgetsDTO;
   
   public class ShopTester {
	public static void main(String a[]){

		System.out.println("\n"+"Enter the number of gadgets");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Shop shop = new Shop(size);
		if(size>0)
		{	
			for(int i = 0; i< size; i++)
			{
			ElectronicGadgetsDTO dto = new ElectronicGadgetsDTO();
			System.out.println("Enter the gadgets details");
			
			System.out.println("Enter the gadget ID");
			int gadgetId = sc.nextInt();
			dto.setGadgetId(gadgetId);
			
			System.out.println("Enter the gadget name");
			String gadgetName = sc.next();
			dto.setGadgetName(gadgetName);
			
			System.out.println("Enter the gadget price");
			int gadgetPrice =sc.nextInt();
			dto.setGadgetPrice(gadgetPrice);
			
			boolean isAdded = shop.createGadgetsDetails(dto);
			System.out.println(isAdded);
				
			
			shop.getAllGadgets();
			
			
			System.out.println("Enter gadget id and gadget price to update");
			int gadgetId1=sc.nextInt();
			int gadgetPrice1=sc.nextInt();
			shop.updateGadgetPriceByGadgetId(1,5000);
			
		
			
			System.out.println("\n"+"Enter gadget Id to delete");
			int id1=sc.nextInt();
			shop.deleteGadgetById(id1);
			
			shop.getAllGadgets();
			
			}
			
		
		}
	}
		
   }  
   
   
   
			
			
			


