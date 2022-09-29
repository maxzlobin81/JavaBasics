package class4;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		/* Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature in the city  is ”
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is your city?");
		
		String city=scanner.nextLine();
		
		System.out.println("What is the temperature in Fahrenheit?");
		
		int temperature=scanner.nextInt(); 
		
		int conversion=(temperature-32)*5/9;
		
		System.out.println("The temperature in the city is "+conversion+" Celsium");
		
	}

}
