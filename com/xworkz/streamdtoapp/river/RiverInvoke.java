package com.xworkz.streamdtoapp.river;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RiverInvoke {
	public static void main(String[] args) {
		RiverDTO dto=new  RiverDTO(1,"Ganga",2525,900);
		RiverDTO dto1=new RiverDTO(2,"Yamuna",1376,3);
		RiverDTO dto2=new RiverDTO(3,"Brahmaputra",2900,1045);
		RiverDTO dto3=new RiverDTO(4,"Mahanadi",400,24);
		RiverDTO dto4=new RiverDTO(5,"Kaveri",1400,4);
		
	    Stream<RiverDTO> riverDTO=Stream.of(dto,dto1,dto2,dto3,dto4);
	         riverDTO.filter((len)->len.getLength()>500)
			  .sorted((a1,a2)->a1.getNoOfDams().compareTo(a2.getNoOfDams()))
			  .collect(Collectors.toList()).forEach((e)->System.out.println(e));
	         System.out.println(System.lineSeparator());
	         
	    Stream<RiverDTO> riverDTO1=Stream.of(dto,dto1,dto2,dto3,dto4);
	         riverDTO1.filter((len)->len.getLength()>500)
			  .sorted((a1,a2)->a2.getNoOfDams().compareTo(a1.getNoOfDams()))
			  .collect(Collectors.toList()).forEach((e)->System.out.println(e));
	         
	         
	         
		
	}

}
