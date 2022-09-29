package class4;

public class Task2 {

	public static void main(String[] args) {
		/*Create a Java program and name it Temperature Check. 
         * Create variable to store temperature. 
         * Your program should check if temperature is below 32 then it should print
         *  “Water will freeze with temperature ”, 
         * otherwise “Water will NOT freeze with temperature ”.
         */

		double temp=32;
		
		if(temp<32) {
			System.out.println("water will freeze with temperature "+ temp);
			
		} else {
			
			System.out.println("water will NOT freeze with temperature "+ temp);
		}
		
	}

}
