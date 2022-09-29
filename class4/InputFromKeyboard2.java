package class4;

import java.util.Scanner;

public class InputFromKeyboard2 {

	public static void main(String[] args) {
		
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Please enter your age");
    
    int age=scanner.nextInt(); // we use NextInt() if we want int type of data from keyboard
    
    
      if(age<18) {
    	System.out.println("You should study");
    	
    } else {
    	System.out.println("You should start working");
    	
     }
		

	}

}
