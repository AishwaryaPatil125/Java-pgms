package com.xworkz.optionalapp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.optionalapp.dto.HockeyDTO;

public class HockeyInvoke {
	public static void main(String[] args) {
		HockeyDTO dto=new HockeyDTO("Ashwini",20,5,"India");
		HockeyDTO dto1=new HockeyDTO("Shwetha",10,20,"Pakistan");
		HockeyDTO dto2=new HockeyDTO("Shreya",15,10,"Australia");
		HockeyDTO dto3=new HockeyDTO("Swati",5,5,"Germany");
		HockeyDTO dto4=new HockeyDTO("Preeti",10,5,"India");
		
		boolean t=dto.equals(dto4);
		System.out.println(t);
		
		Set<HockeyDTO> hoc=new  LinkedHashSet<HockeyDTO>();
		hoc.add(dto4);
		hoc.add(dto3);
		hoc.add(dto2);
		hoc.add(dto1);
		hoc.add(dto);
		
		Optional<HockeyDTO> op=hoc.stream().filter((a)->a.getLoses()>10).findFirst();
		System.out.println(op);
	}
	

}

