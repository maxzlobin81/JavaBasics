package class4;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/* Scanner is a class that helps us take input from the keyboard
		 * it contains many different smaller modules called methods that can help 
		 * us take Strings booleans basically all types of data from the keyboard
		 */
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=input.next();
		
		System.out.println("Hello "+name);

		
	}

}
