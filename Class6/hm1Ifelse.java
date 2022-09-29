package Class6;

import java.util.Scanner;

public class hm1Ifelse {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it. 
		 *Once values are captured print which language user speaks. 
		 */
		
Scanner hm1=new Scanner(System.in);

System.out.println("Please enter the country you are from");

String country=hm1.nextLine();

String language;


if(country.equals("USA")) {
		language="English";
		
		
		
System.out.println("You speak "+language);		
		
} else if(country.equals("Russia")) {
        language="Russian";	
        
System.out.println("You speak "+language);
	
} else if(country.equals("Armenia")) {
            language="Armenian";
            
System.out.println("You speak "+language);            
            
} else if(country.equals("Lebanon")) {
                language="Lebanese";
         
System.out.println("You speak "+language);


} else {
	
	System.out.println("Invalid Country");
	
        } 
      }
		
	}

