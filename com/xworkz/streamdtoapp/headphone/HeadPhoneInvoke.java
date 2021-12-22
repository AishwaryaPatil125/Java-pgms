package com.xworkz.streamdtoapp.headphone;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeadPhoneInvoke {
public static void main(String[] args) {
	HeadPhoneDTO headPhoneDTO=new HeadPhoneDTO(11,"Philips","Wired","shb8750nc", 399);
	HeadPhoneDTO headPhoneDTO1=new HeadPhoneDTO(12,"Boat","Wireless","rokerz 510", 599);
	HeadPhoneDTO headPhoneDTO2=new HeadPhoneDTO(13,"OnePlus buds","Wireless","1091100041 type-c", 2995);
	HeadPhoneDTO headPhoneDTO3=new HeadPhoneDTO(14,"Noise Unisex Blue Solid","Wireless","VS103", 1499);
	HeadPhoneDTO headPhoneDTO4=new HeadPhoneDTO(15,"Apple","Wireless","Apple Airpods 2", 1199);
	System.out.println("HeadPhone Details");
	
	Stream<HeadPhoneDTO> headPhoneDTOs=Stream.of(headPhoneDTO,headPhoneDTO1,headPhoneDTO2,headPhoneDTO3,headPhoneDTO4);	
	 headPhoneDTOs
			.sorted((p1,p2)->p1.getId().compareTo(p2.getId()))
			.collect(Collectors.toList()).forEach((a)->System.out.println(a));
	 
	System.out.println("Collect only model");
	 Stream<HeadPhoneDTO> headPhoneDTOs1=Stream.of(headPhoneDTO,headPhoneDTO1,headPhoneDTO2,headPhoneDTO3,headPhoneDTO4);	
	 headPhoneDTOs1
			.sorted((p1,p2)->p1.getBrand().compareTo(p2.getBrand()))
			.map((e)->e.getModel())
			.collect(Collectors.toList()).forEach((a)->System.out.println(a));
}
}
