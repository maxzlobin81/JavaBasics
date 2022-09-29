package class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/* 
		 *  //*Write a program that will print whether it is a weekend or weekday.
		 *  If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		 */

		Scanner task2=new Scanner(System.in);
		
		
		int input=task2.nextInt();
				
				
		
		if(input>=1 && input<=5) {
			
			System.out.println("It is a weekday");
			
		} else if (input==6 || input==7) {
			
			System.out.println("It is a weekend");
		
		} else {
			
			System.out.println("Invalid Day");
			
	
		
	  }
		
		
	}

}
