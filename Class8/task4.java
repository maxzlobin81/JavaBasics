package Class8;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		/*Write a program to ask a user to enter item they want to buy and the price of that item.
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever user done with payments program should say "Thank you for shopping!"
		 */
		
		Scanner task4=new Scanner(System.in);
		
		System.out.println("Enter item you want to buy");
		
		String item=task4.nextLine();
		
		System.out.println("Enter price of the item");
		
		double price=task4.nextDouble();
		
		double money;
		
		double total=0.0;
		
		
		do {
			
			System.out.println("How much money do you have");
			
			money=task4.nextDouble();
			
		total+=money;// accumulate all money
		
		double need;
		
		double change;
		
		if (total<price) { 
			
			need=price-total;
			
			System.out.println("You need to pay more $ "+need);
			
		} else if (total>price) {
			
			change=total-price;
			
			System.out.println("Here is your change "+change);
			
			break;
			
		}
		
		} while (total>price);
		
		System.out.println("Thank you for shopping");
		
		
	}
		
	}

	
