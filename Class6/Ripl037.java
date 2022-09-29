package Class6;

import java.util.Scanner;

public class Ripl037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ripl37=new Scanner(System.in);

		  System.out.println("Are you thirsty?");
		  
		  Boolean input1=ripl37.nextBoolean();
		  
		  System.out.println("Are you sleepy?");
		  
		  Boolean input2=ripl37.nextBoolean();

		 
		  if(input1 && !input2) {
		    System.out.println("drink=water");

		  } else if(input1 && input2) {
		    System.out.println("drink=coffee");

		  } else if(!input1 && input2) {
		    System.out.println("drink=tea");
		    
		  } else {

		  System.out.println("nothing");
		      
		      }
		   }
	}

