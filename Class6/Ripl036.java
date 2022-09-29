package Class6;

import java.util.Scanner;

public class Ripl036 {

	public static void main(String[] args) {
		/*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
          and make the comparisons:

- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"
		 */

	Scanner ripl36=new Scanner(System.in);
	
	System.out.println("Please enter two strings");
	
	String input1=ripl36.nextLine();
	
	String word1="apple";
	
	String word2="banana";
	
	System.out.println("Please enter two numbers");
	
	int input2=ripl36.nextInt();
	
	int int1=10;
	
	int int2=20;
	
	if(int1==int2 && word1.equals(word2)) {
		
	System.out.println("AND");
	
	} else if(int1==int2 || word1.equals(word2)) {
		
	System.out.println("OR");
	
	} else if(int1!=int2 && !word1.equals(word2)) {
		
	System.out.println("NONE");
	
		
	          }
	
	
	      } 
	
	
	}


