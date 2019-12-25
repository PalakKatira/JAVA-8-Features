package com.palak.java8_features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

/**
 * To process objects from the Collection,we need to go with Stream so as to
 * reduce the code complexity 
 * 	1.filter(Predicate)-Pedicate is a boolean value function,the return type is always boolean
 *  2.map(Function)-Return type can be anything that is for business logistics
 *  3.foreach(consumer)-only consumes does not return anything
 *  4.toArray-converts stream into array
 * stream(),filter(),map(),collect(),count(),sorted(),sorted(comparator)
 * @author Surbhi
 *
 */

public class StreamDemo {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);//<45
		list.add(23);//<45
		list.add(90);
		list.add(24);//<45
		
		System.out.println(list);
		
		//Way-1
		for(Integer i:list) {
			System.out.println(i);
		}

		/**
		 * Beautiful concept for tracing Arraylist
		 */
		
		//Way-2
		list.stream().forEach(System.out::println);
		
		List<Integer> l1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l1);

		//collectors.tolist works on collect only,return type will be list only
		List<Integer> l2 = list.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(l2);
		
		//count method works on the stream directly
		long noOfFailedStudents=list.stream().filter(m->m<45).count();
		System.out.println(noOfFailedStudents);
		
		//Sorted method,internally comparable interface is called containg compareTo method for default ascending order
		List<Integer> l3=list.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);
		
		//Customised sorting order by using comparator concept
		//comparator is a functional interface and can be replaced with lambda expression
		List<Integer> l4=list.stream().sorted((i1,i2)->(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(l4);
		
		int maxNumber=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		int minNumber=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("The maxNumber and minNumber are:"+maxNumber+" "+minNumber);
		
		//to convert stream of objects into array
		Integer[] ii=list.stream().toArray(Integer[]::new);//returns integer array object
		
		for(Integer i:ii) {
			System.out.println(i);
		}
		
		//converting integer array to stream and then applying foreach 
		Stream.of(ii).forEach(System.out::println);
}
}
