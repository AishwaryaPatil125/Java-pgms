package com.xworkz.streamapp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNoInvoke {
	public static void main(String[] args) {
		Stream<Integer> rollNoStream=Stream.of(1,15,20,16,19,25,16,72,67,10,42,61,89,11,18,56,84,38,33,49);
		List<Integer> tempList=rollNoStream
				.filter((p)->p>50)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
	}

}
