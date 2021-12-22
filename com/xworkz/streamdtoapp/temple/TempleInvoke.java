package com.xworkz.streamdtoapp.temple;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempleInvoke {
	public static void main(String[] args) {
		
		TempleDTO dto=new  TempleDTO(1,"Mata Mansa Devi","Haryana","Manasa Devi",10000);
		TempleDTO dto1=new TempleDTO(2,"Anegudde","Udupi ","Ganesh",90000);
		TempleDTO dto2=new TempleDTO(3,"Iskcon","RadhaKrishna","Bengaluru",10450);
		TempleDTO dto3=new TempleDTO(4,"Kukke Subhramanya","Naga","Kumaradhara",20000);
		TempleDTO dto4=new TempleDTO(5,"Mukhambika Temple","Mookambika","Kollur",10005);
		
	    Stream<TempleDTO> templeDTO=Stream.of(dto,dto1,dto2,dto3,dto4);
	         templeDTO.filter((a)->a.getVisitorsPerDay()>10000)
			  .sorted((a1,a2)->a2.getVisitorsPerDay().compareTo(a1.getVisitorsPerDay()))
			  .collect(Collectors.toList()).forEach((e)->System.out.println(e));
	}

}
