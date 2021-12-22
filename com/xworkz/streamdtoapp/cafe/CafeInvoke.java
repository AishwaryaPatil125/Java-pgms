package com.xworkz.streamdtoapp.cafe;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CafeInvoke {
public static void main(String[] args) {
	CafeDTO dto=new CafeDTO(1,"Onesta","Rajajinagar",4.5f);
	CafeDTO dto1=new CafeDTO(2,"Blueberry","Dharwad",3.9f);
	CafeDTO dto2=new CafeDTO(3,"MCdonalds","Mysore road",4.6f);
	CafeDTO dto3=new CafeDTO(4,"Happy Plotter","Navarang",2.9f);
	CafeDTO dto4=new CafeDTO(5,"PizzaHut","Nagarbhavi",3.0f);
	
    Stream<CafeDTO> cafeDTO=Stream.of(dto,dto1,dto2,dto3,dto4);
          cafeDTO
         .filter((e)->e.getRating()>3)
		  .sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
		  .collect(Collectors.toList()).forEach((e)->System.out.println(e));
	
	   
}
}
