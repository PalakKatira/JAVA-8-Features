package com.palak.java8_features;

/**
 * Alternative to lambda expression
 * Arguments must match-only one condition
 * If the implementataion is already available,go for method reference
 * @author Surbhi
 *
 */

//perfectly functional interface
interface Interf {
	public void add(int a,int b);//abstract add method
}

class Test{
	
	//method defination 
	//this method is written so as to show method reference
	//code reusability 
	public void sum(int x,int y) {
		System.out.println("The sum of 2 numbers x and y is:"+(x+y));
	}
	
	public static void main(String[] args) {
		Interf i=(a,b)->System.out.println("The sum is:"+(a+b));
		i.add(21, 32);
		
		//functional interface  method add method refering test class sum method
		Test t=new Test();
		Interf i1=t::sum;
		i1.add(100,200);
		}
	
	
}