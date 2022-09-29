package Project1Practice;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// // Using Scanner create an array of integer values.
		//After the array is created, calculate the sum of all stored elements in that array.

		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the size of the array");
		
		int size=scanner.nextInt();
		
		//it creates an array of the above size
		
		int [] arr=new int [size];
		
		
		
		
		for(int i=0; i<size; i++) {
			
			System.out.println("Please enter an int number");
			
			arr[i]=scanner.nextInt();
			
					
		}
		
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		
		for(int num:arr) {
			
		sum+=num;
			
		}
		
		System.out.println("Sum of all the numbers from the Array is "+sum);
		
	}
}