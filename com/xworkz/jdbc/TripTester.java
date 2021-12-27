package com.xworkz.jdbc;

public class TripTester {
	public static void main(String[] args){
		String driverFQN="com.mysql.cj.jdbc.Driver" ;
	try {
		   Class.forName(driverFQN);
		System.out.println("adding driver location");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
