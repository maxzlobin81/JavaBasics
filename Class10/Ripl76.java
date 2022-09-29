package Class10;

import java.util.Scanner;

public class Ripl76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in); 
		  
		String []arr=new String[7];

		  System.out.println("Input days of a week beginning with Sunday");

		  for(int i=0; i<7; i++) {
		    arr[i]=input.nextLine(); 
		  }

		  for(String day:arr) {

		    System.out.println(day);

		  } 
		  }
		  
}

	
		



