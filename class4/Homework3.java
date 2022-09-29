package class4;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How much do you need to borrow?");
		
		int amount=scanner.nextInt();
		
		if(amount<=200000)  {
			
			System.out.println("Congratulations! We will lend you the money");
			
		} else {
			
			System.out.println("Sorry, we will not loan at this time");
			
		}
		
		
	}

}
