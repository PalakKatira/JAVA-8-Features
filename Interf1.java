package com.palak.java8_features;

class Sample {

	// Default constructor
	Sample() {
		System.out.println("Defalt constructor called.");
	}

	// Prameterised constructor
	Sample(String s) {
		System.out.println("Sample class constructor execution");
	}
}

interface Interf1 {
	public Sample get(String s);
}

class Test1 {
	public static void main(String[] args) {
		// Interface method refers sample class constructor
		Interf1 i1 = Sample::new;
		Sample s1 = i1.get("Durga");
		Sample s2 = i1.get("Palak");
		Sample s3 = i1.get("Suru");
	}
}