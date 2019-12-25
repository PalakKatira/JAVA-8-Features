package com.palak.java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
public static void main(String[] args) {
	
	List<String> names=new ArrayList<String>();
	names.add("Palak Katira");
	names.add("Shubham Srivastava");
	names.add("Ashutosh Malik");
	names.add("Vasu Sharma");
	
	System.out.println(names);
	
	List<String> sortedName=names.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedName);
	
	List<String> decSortedName=names.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());;
	System.out.println(decSortedName);
	
	List<String> order=names.stream().sorted((s1,s2)->{
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2) return -1;
		else if(l1>l2) return +1;
		else return 0;
	}).collect(Collectors.toList());
	System.out.println(order);
}
}
