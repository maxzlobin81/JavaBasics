package Class6;

import java.util.Scanner;

public class hm1Switch {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it. 
		 *Once values are captured print which language user speaks. 
		 */

	Scanner hm1=new Scanner(System.in);
	

	System.out.println("Please enter the country you are from");

	String country=hm1.nextLine();
	
	String language;
	
			
	
	switch(country) {
	
	case "USA":
    language="English";
    break;
    
	case "Russia":
	language="Russian";
	break;
	
	case "Armenia":
	language="Armenian";
	break;
	
	case "Lebanon":
	language="Lebanese";
	break;
	
	default:
		language="Invalid";
		
	}
	
	System.out.println("You are from "+country+" and you speak "+language);
	
	
	
	
		
		
		
		
		
		
	
		
	}

}
