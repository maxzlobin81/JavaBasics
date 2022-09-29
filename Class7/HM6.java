package Class7;

import java.util.Scanner;

public class HM6 {

	public static void main(String[] args) {
		/*
		 *  Declare a variable to store a price for a coffee. Ask the user to pay for a coffee.
		 *  Keep asking to pay for coffee until the user enters the EXACT amount . 
		 *  If the user gives more than coffee price --> ask them to give less, if the user gives less money then ask to give more.
		 *  Once user give EXACT amount print “Please enjoy your coffee
		 */
		
		Scanner hm6=new Scanner(System.in);
		
		double coffeeprice=1.49;
		
		double pay;
		
		do {
			
			System.out.println("Please pay for your coffee");
			
			pay=hm6.nextDouble();
			
			
		  if(pay>coffeeprice) { 
			
			System.out.println("Please give less");
			
			System.out.println();
			
		} else if(pay<coffeeprice) {

		
           System.out.println("Please give more");
           
           System.out.println();
           
		}
		
		 
		} while (!(pay==1.49));
		  
		  System.out.println("Please enjoy your coffee");
		  
	   
				
	}
		
}