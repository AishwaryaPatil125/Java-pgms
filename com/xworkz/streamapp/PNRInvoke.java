package com.xworkz.streamapp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNRInvoke {
public static void main(String[] args) {
	Stream<Long> pnrStream=Stream.of(1234890876L,6790876908L,9087658903L,8760921456L,7890765432L,1290876504L,5678908765L,7890765478L,3456789076L,7890876890L,6789065436L,8907654327L,9087659087L,5690908768L,3456767890L,6786545676L,8907689076L,56787644424L,4356789045L,8906547894L);
	List<Long> tempList=pnrStream
	           .filter((p)->p>5000000000L)
	           .sorted()
	           .collect(Collectors.toList());
	           tempList.forEach((p)->System.out.println(p));
}
}
