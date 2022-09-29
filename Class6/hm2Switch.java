package Class6;

import java.util.Scanner;

public class hm2Switch {

	public static void main(String[] args) {
		/* Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner hm2=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		
		char grade=hm2.next().charAt(0);
		
		String explanation;
		
		switch(grade) {
		
		case 'A':
			explanation="A-excellent";
			break;
			
	    case 'B':
	    	explanation="B-Good";
	    	break;
	    	
	    case 'C':
	    	explanation="C-Average";
	    	break;	
			
	    case 'D':
	    	explanation="D-Bad";
	    	break;	
	    
		default:
			explanation="Not Acceptable";
			
			}
			
	System.out.println("Your grade is "+grade+" ,"+explanation);
		
		
			
			
		
		
		
		

	}

}
