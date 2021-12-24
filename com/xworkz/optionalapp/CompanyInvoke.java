package com.xworkz.optionalapp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.optionalapp.dto.CompanyDTO;

public class CompanyInvoke {
	public static void main(String[] args) {
		CompanyDTO dto=new CompanyDTO( 1,"IBM","Arvind Krishna",6543278765.00d);
		CompanyDTO dto1=new CompanyDTO( 2,"Google","Sundar Pichai",3453217898.00d);
		CompanyDTO dto2=new CompanyDTO( 3,"Microsoft","Satya Nadella",5678543278.00d);
		CompanyDTO dto3=new CompanyDTO( 4,"Adobe Inc","Shantanu Narayen",4789054326.00d);
		CompanyDTO dto4=new CompanyDTO( 5,"Wipro","Thierry Delaporte",7890765438.00d);
	   
		boolean booln=dto.equals(dto4);
		System.out.println(booln);
		Set<CompanyDTO> cmpy=new LinkedHashSet<CompanyDTO>();
		cmpy.add(dto4);
		cmpy.add(dto3);
		cmpy.add(dto2);
		cmpy.add(dto1);
		cmpy.add(dto);
		
  Optional<CompanyDTO> opt=cmpy.stream().filter((e)->e.getName().equals("Google")).findFirst(); 
		System.out.println(opt);
		
	}
}
