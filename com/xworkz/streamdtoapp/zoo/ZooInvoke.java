package com.xworkz.streamdtoapp.zoo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooInvoke {
	public static void main(String[] args) {
		ZooDTO dto= new ZooDTO(1,"Mysore Zoo","Karnataka",2000);
		ZooDTO dto1=new ZooDTO(2,"National Zoological Park","Delhi",1500);
		ZooDTO dto2=new ZooDTO(3,"Maharajbagh zoo","Maharashtra",1200);
		ZooDTO dto3=new ZooDTO(4,"Sarthana zoo","Gujarat",900);
		ZooDTO dto4=new ZooDTO(5,"Kanpur zoological park","Uttar Pradesh",800);
		
		Stream<ZooDTO> zooDTOs=Stream.of(dto,dto1,dto2,dto3,dto4);	
        zooDTOs
		.sorted((p1,p2)->p2.getTicketPrice().compareTo(p1.getTicketPrice()))
		.collect(Collectors.toList()).forEach((a)->System.out.println(a));
		
		   
	}

}
