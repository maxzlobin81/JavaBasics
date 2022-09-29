package com.syntax.class02;

public class HomeworkFromAsel {

	public static void main(String[] args) {
		
		// Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The __ of 2 numbers __ and  is equal to __”

		
		double a=5.5;
		double b=7.5; 
		
		double add=(a+b);
		double subtract=(a-b);
		double multiply=(a*b);
		double divide=(a/b);
		
		System.out.println("The addition of 2 numbers "+a+ " and "+b+ " is equal to " +add);
		System.out.println("The substraction of 2 numbers "+a+ " and "+b+ " is equal to "+subtract);
		System.out.println("The multiplication of 2 numbers "+a+ " and "+b+ " is equal to "+multiply);
		System.out.println("The division of 2 numbers "+a+ " and "+b+ " is equal to "+divide);
		
		
		// Write a program to find the square of the number 3.9. You program should say “The square of the  is  “
		
		double c=3.9;
		double square=(c*c);
		
		System.out.println("The square of the "+c+ " is "+square);
		
		/*  Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
		 *  Your program should say. “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
		 */
		
		double width=5;
		double height=8;
		double area=(width*height);
		
		double perimeter=((width+height)*2);
		
		System.out.println("The perimeter of a rectangle with width "+width+ " and height "+height+ " is equal to "+perimeter+ " and the area is "+area);
		
		
	

	}

}
