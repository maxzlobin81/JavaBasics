package Class10;

import java.util.Scanner;

public class Ripl77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);

		int n=5;
		int[]array=new int[n];


		for(int i=0;i<5;i++) {
		 array[i]=input.nextInt();
		}


		for(int i=4; i>=0; i--) {
		System.out.println(array[i]+ " ");
		}
		  

		}

	}


