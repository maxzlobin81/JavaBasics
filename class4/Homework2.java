package class4;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/* Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. 
		 * Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash
		 */

		Scanner scanner=new Scanner (System.in);
		
		System.out.println("What's your rate?");
		
		double mortgagerate=scanner.nextDouble();
		
		
		
		
		if(mortgagerate>4.5) {
			
			System.out.println("You will not buy a house");
			
		} else { 
		
			System.out.println("You will consider bying a house"); 
			
			
			System.out.println("What's your house price?");
			
			double houseprice=scanner.nextDouble();
			
			
			if(houseprice>200000) {
		
		
			System.out.println("You will take a loan");
			
		} else {
			
			System.out.println("You will pay cash");
			
		}
		
		}
		
	}
		
}	



