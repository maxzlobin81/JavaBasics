package class5;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*Write a program for user to enter his/hers birth month. Based on the month define the season.
         if user is born in June, July, August → 
         season =”Summer”  etc …
		 *  TODO Auto-generated method stub
		 */

		Scanner hw3=new Scanner(System.in);
		
		System.out.println("Enter your birth month");
		
		String month=hw3.next();
		
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			
		System.out.println("Winter"); }
		
		else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			
		System.out.println("Spring"); }
		
		else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			
		System.out.println("Summer");}
		
		else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			
		System.out.println("Fall");	
			
		}
	}
			
	

}
