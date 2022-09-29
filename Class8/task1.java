package Class8;

public class task1 {

	public static void main(String[] args) {
		// from the range of 1 to 50 please find the sum of all even and odd numbers
		
		
		int sumOdd;
		int sumEven;
		
		for(int x=1; x<=50; x++) {
			
			if(x%2==0) {
				
				sumEven+=x;
				
			} else {

				sumOdd+=x;
				
			}	
			
		}
			System.out.println("Sum of Odd numbers = "+sumOdd);

			System.out.println("Sum of Even numbers = "+sumEven);


}
