package Project1Practice;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		/* Using Scanner create an array of countries.
		 * When an array is created, retrieve all values from it and while retrieving those values print capital for each country.
		 * (use 2 different loops).
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter how many countries you want to store");
		
		int size=scanner.nextInt();
		
		//two arrays one to store the countries and the other one to store the capitals
		
		String [] countries=new String[size];
		String [] capitals=new String[size];
		
		//this is to consume that extra enter that we will be getting
		scanner.nextLine();
		
		for(int i=0; i<size; i++) {
			
			System.out.println("Please enter the country name");
		    countries [i]=scanner.nextLine(); 
			
            System.out.println("Please enter the capital for "+countries[i]);
			capitals [i]=scanner.nextLine();
			
		}
			
			System.out.println(Arrays.toString(countries));
			
			System.out.println(Arrays.toString(capitals));
			
			for(int i=0; i<size; i++) {
				
				System.out.println("The country "+countries[i]+" Has the capital "+capitals[i] );
			}
	
			
		}

	}


