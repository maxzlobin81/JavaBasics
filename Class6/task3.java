package Class6;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* we need to ask the user where he/she is from
	 * based on the country --> define favorite food
	 * 
	 * 	
	 */
		
	Scanner in=new Scanner(System.in);
	
	System.out.println("Please tell me where are you from?");
	
	String country=in.nextLine();
	
	String favoriteFood;
	
	switch(country) {
	
	case "USA":
		favoriteFood="burgers and fries";
		break;
		
	case "Kazakhstan":
		favoriteFood="beshparmak";
		break;
		
	case "Turkey":
		favoriteFood="adana kebab";
		break;
		
	case "Venezuela":
		favoriteFood="Arepa";
		break;
		
	case "India":
		favoriteFood="Chicken Curry";
		break;
		
	case "Russia":
		favoriteFood="Beef Stroganoff";
		break;
		
	case "Yemen":
		favoriteFood="Mandi";
        break;
        
	case "Afghanistan":
		favoriteFood="Qaboli Palow";
		break;
		
	default:
		favoriteFood="Uknown";
		
	}
	
	System.out.println("You are from " + country+ " and your favorite food is "+favoriteFood);
			
		
	}

	
		
	}


