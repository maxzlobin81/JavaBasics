package com.syntax.class03;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Where are you born?");
		
		String birthplace=scan.next();

		System.out.println(birthplace);
		
		System.out.println("What's your zip code?");
		
		int zipcode=scan.nextInt();
		
		System.out.println("What's your favorite pet");
		
		String pet=scan.next();
		
		System.out.println("Thank you, you birthplace is " + birthplace + ", your zipcode is " + zipcode);
		System.out.println(", and your favorite animal is " + pet);
		
	
		
	
		
	}
	

}
