package class4;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		/* You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them,
		 *  otherwise you will offer them to get a learners permit. TODO Auto-generated method stub
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is your age?");
		
		int age=scanner.nextInt(); 
			
		if(age>=18)  {  
			
			System.out.println("We will issue a driver's license");
			
		} else {
			
			if(age<18)
			
			System.out.println("We cann't issue a DL, would you like to get a learner's permit?");
			
			
			
		}
	}

}
