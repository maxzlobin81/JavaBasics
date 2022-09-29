package Class9;

public class HW3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
		
		int [] integers= {12, 15, 33, 44, 77, 101}; 
		
		int sum=0;
		
		for(int x=0; x<integers.length; x++) {
			
        sum += integers[x];

		}
		
		
		System.out.println(sum);

	}


}