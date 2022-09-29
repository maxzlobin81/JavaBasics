package Class7;

import java.util.Scanner;

public class HM5 {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon+name...
		
		Scanner hm5=new Scanner(System.in);
		
		String name;
		
		for(int c=1; c<=3; c++) {
			
			System.out.println("Please enter your name");
			
			name=hm5.nextLine();
			
			System.out.println("Good afternoon "+name);
			
			System.out.println();
			
			
			
		}
		

	}

}
