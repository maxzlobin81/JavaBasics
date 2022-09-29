package class4;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		Scanner weather=new Scanner(System.in);
		System.out.println("Is it sunny outside?"); 
		
		Boolean isSunny=weather.nextBoolean();
		  if(isSunny==false) {
		
		System.out.println("I stay home and practice Java"); 
		
		  
		  
		  } else {
			  
		  System.out.println("It is a sunny day, I should go somewhere!");
		  
		  System.out.println("What is the temperature outside?");
		  
		  
		 int temperature=weather.nextInt();
		  
		 if(temperature>85) {
		
	      System.out.println("I am going to the beach");
		
	      } else {
		
 	      System.out.println("I am going to the park");
		  
	     
	     
		  
     	      }	  
        }   
	}

}