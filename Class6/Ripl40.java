package Class6;

import java.util.Scanner;

public class Ripl40 {

	public static void main(String[] args) {
		
		Scanner ripl40=new Scanner(System.in);
		
		System.out.println("Enter name of the instructor");
		String instructor=ripl40.nextLine();

		  switch(instructor) {
		    case "Asghar":
		      System.out.println("Will take care of Java Assignment");
		      break;
		    case "Moazzam":
		      System.out.println("Will take care of SDLC Assignment");
		      break;
		    case "Weqas":
		      System.out.println("Will take care of Selenium Assignment");
		      break;
		    case "Asel":
		      System.out.println("Will take care of every Assignment");
		      break;
		    default:
		      System.out.println("Invalid instructor selected");
		  }
		 }
		}
		
