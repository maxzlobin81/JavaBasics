package Class6;

import java.util.Scanner;

public class hm3Ifelse {

	public static void main(String[] args) {
		/*  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.
         *  Please complete this assignment in 2 ways: using if statement and switch case.package Class6;
		 */

		
		Scanner hm3=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		
		Double num1=hm3.nextDouble();
		
	    System.out.println("Please enter second number");
	    
	    Double num2=hm3.nextDouble();
	    
	    System.out.println("Please enter operation you would like to perform");
	    
	    char operator=hm3.next().charAt(0);
	    
	    if(operator=='+') {
	    System.out.println("Your result is "+(num1+num2));
	    
	    } else if(operator=='-') {
	    System.out.println("Your result is "+(num1-num2));
	    
	    } else if(operator=='*') {
		    System.out.println("Your result is "+(num1*num2));
	    
	    } else if(operator=='/') {
		    System.out.println("Your result is "+(num1/num2));    
	    	
	    }
	    
		
	}

}
