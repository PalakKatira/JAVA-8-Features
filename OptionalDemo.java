package com.palak.java8_features;

import java.util.Optional;

/**
 * What is Optional? Introduced in JAVA-8 
 *  
 *  Advantages of Optional:
 *  1.Better way of handling null check
 *  2.Avoid NullPointerException Present in Util package.
 * 
 * @author Surbhi
 *
 */

public class OptionalDemo {

	
	public static void main(String[] args) {

		
		//Optional<String> op = Optional.empty();
		//System.out.println(op);
		
		
		//Before JAVA 8
		String book=null;
		if(book!=null) {
			System.out.println(book.toUpperCase());
		}
		else {
			book="Palak";
			System.out.println(book.toUpperCase());
		}
		
		
		//Using optional
	
		/*optionalString=Optional.ofNullable(book1);//ofNullable is a method whch will take null as well as not nullable value
		if(optionalString.isPresent()) {
			System.out.println(optionalString.get().toLowerCase());
		}*/
		
		//Using optional orElse method which is same as get method
		String book1=null;
		Optional<String> optionalString = Optional.ofNullable(book1);//ofNullable is a method whch will take null as well as not nullable value
		//if(optionalString.isPresent()) {
			System.out.println(optionalString.orElse("Suru").toLowerCase());
		}
		
	
}
