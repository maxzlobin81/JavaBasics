package Class8;

import java.util.Scanner;

public class Ripl63 {

	public static void main(String[] args) {
		//Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
		// int x
		

		Scanner ripl63=new Scanner(System.in);
		
		
		System.out.println("Please enter a value"); 
		
		int x=ripl63.nextInt();
		
		for (int y=0; y<=x; y++) {
			
			System.out.println(y);
		}
		
		
		
		
	}

}
