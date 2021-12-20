package com.xworkz.streamapp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPinInvoke {
	public static void main(String[] args) {
		Stream<Integer> atmPinStream=Stream.of(1000,6789,3214,9087,999,543,6754,9087,2678,9065,3456,555,235,6754,9032,678,0542,4567,321,890);
		List<Integer> tempList=atmPinStream
		           .filter((p)->p>1000)
		           .sorted()
		           .collect(Collectors.toList());
		           tempList.forEach((p)->System.out.println(p));
	}

}
