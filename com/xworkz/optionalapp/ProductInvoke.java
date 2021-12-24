package com.xworkz.optionalapp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.optionalapp.dto.ProductDTO;

public class ProductInvoke {
	
	public static void main(String[] args) {
		ProductDTO dto=new ProductDTO(1,"Alpenlibe","Chocolate",5,5);
		ProductDTO dto1=new ProductDTO(2,"Aishwarya","Rice",10000,1);
		ProductDTO dto2=new ProductDTO(3,"Duke","Bike",100000,4 );
		ProductDTO dto3=new ProductDTO(4,"Sunflower","Oil",8000,2);
		ProductDTO dto4=new ProductDTO(5,"Sony","Television",800000,5);
		
		boolean booln=dto.equals(dto3);
		System.out.println(booln);
		
		Set<ProductDTO> product=new LinkedHashSet<ProductDTO>();
		product.add(dto4);
		product.add(dto3);
		product.add(dto2);
		product.add(dto1);
		product.add(dto);
		Optional<ProductDTO> opt=product.stream().filter((a)->a.getPrice()>200000).findFirst();
	    System.out.println(product.size());
		System.out.println(opt);
	}

}



