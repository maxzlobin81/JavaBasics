package Class6;

import java.util.Scanner;

public class Ripl43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ripl43=new Scanner(System.in);
		System.out.println("input a number between 1-12");
		
		int input=ripl43.nextInt();
		
		String month;
		
		
		switch(input) {
		

		    
		case 1:
		month="January";
		break;

		case 2:
		month="February";
		break; 

		case 3:
		month="March";
		break;

		case 4:
		month="April";
		break;   
		    
		case 5:
		month="May";
		break;

		case 6:
		month="June";
		break;

		case 7:
		month="July";
		break;    

		case 8:
		month="August";
		break;    

		case 9:
		month="September";
		break;

		case 10:
		month="October";
		break;  

		case 11:
		month="November";
		break;    

		case 12:
		month="December";
		break;

		default:
		month="Invalid";
		
		}
		
		System.out.println(month);

		}	 
		 }   
			
		
		
	


