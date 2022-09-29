package Class8;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		/*
		 *  create a secret number and let user guess the secret number 
		 *  once guessed your secret number ----> program says you won!\
		 */

		
		Scanner task2=new Scanner(System.in);
		
		
		double secretnumber=11;
		
		double number;
		
		do {
			
			System.out.println("Please guess my secret number");
			
			number=task2.nextDouble();
			
		}
		
		while(number!=secretnumber);
			
		
		System.out.println("You won!");
		
		
	}

}
