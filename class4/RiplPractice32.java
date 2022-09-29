package class4;

import java.util.Scanner;

public class RiplPractice32 {
	
	public static void main(String[] args)  {
		
	Scanner newripl=new Scanner(System.in);

	System.out.println("Please enter your gender: M or F");
	
	String gender=newripl.next();


	System.out.println("Please enter your age");
	
     int age=newripl.nextInt();
    
    

    if (age>25) {	
    	
   
    	if (gender.equals("F")) {

    System.out.println("Woman");

    } else {
      System.out.println("Man"); 
      
    }
      
    } else {
      
   

    if(gender.equals("F")) { 
    
    

      System.out.println("Girl"); 

    } else {

      System.out.println("Boy");

       }
    
       }
    }
   
}