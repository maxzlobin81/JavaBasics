package com.syntax.class02;

public class NonprimitiveDataTypes {

	public static void main(String[] args) {
		// String is just one example of many many nonprimitive types
		
		String name="Asma";

		String address="123 address street";
		
		String phone="123 456 789";
		
		String age="17"; // anything you put inside double quotes Java treats it as a String
		
		String character="A";
		
		System.out.println(name);
		
		// "My name is" + Asma
		// to contitinate two strings we use + sign
		
		System.out.println("My name is "+ name);

		// Asma is 17
		
		System.out.println(name + " is " + age);
		
		String fruit="apple";
		double price=1.99;
		
		System.out.println("the price of the "+fruit+ " is " + price);
		
		/* to attach any value (int, double, boolean, char, etc)
		 * to a string we use +
		 * + next to a string acts as Concatenation
		 */
		
		fruit="mango";
	    price=5.99;
				
				System.out.println("the price of the "+fruit+ " is " + price);
				
				
		
		
		
	}

}


