package Class9;

public class HW4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int [] numbers= {10, 50, 100, 3, 75, 233};
		
		int maxnumber=numbers[0];
		
		for(int x=0; x<numbers.length; x++) {
			
			if(numbers[x]>maxnumber) {
				
				maxnumber=numbers[x];
			}
			
		}
			
			System.out.println("Largest number in this array is: "+maxnumber);
				
				
				
				
			}
			
}


	
	
	
	
	
	
	