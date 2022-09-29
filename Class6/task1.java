package Class6;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		/*Write a program for user to enter his/hers birth month. Based on the month define the season.
        if user is born in June, July, August → 
        season =”Summer”  etc …
		 *  TODO Auto-generated method stub
		 */

		Scanner hw3=new Scanner(System.in);
		
		System.out.println("Enter your birth month");
		
		String month=hw3.next();
		
		String seasons;
		
		if(seasons.equals("December") || seasons.equals("January") || seasons.equals("February")) {
			
			seasons="Winter";
			
		
		} else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			
			seasons="Spring";
		
		} else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			
			seasons="Summer";
		
		} else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			
			seasons="Winter";
			
		System.out.println("seasons");	
			
		}
	
	}

}
