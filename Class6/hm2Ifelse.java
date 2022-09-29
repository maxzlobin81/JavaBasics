package Class6;

import java.util.Scanner;

public class hm2Ifelse {

	public static void main(String[] args) {
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 *A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner hm2=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		
		char grade=hm2.next().charAt(0);
		
		if(grade=='A') {
			
		System.out.println("A-Excellent");
		
		} else if (grade=='B') {
			
		System.out.println("B-Good");
		
		} else if (grade=='C') {
			
		System.out.println("C-Average");
		
		} else if (grade=='D') {
			
		System.out.println("D-Bad");	
			
		}
		
		else {
        	
        System.out.println("Not Acceptable");
        
				
			
	   }
		

	 }

  }
