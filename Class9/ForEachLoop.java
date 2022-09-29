package Class9;

public class ForEachLoop {

	public static void main(String[] args) {
		// only when we deal with arrays of collections
		// we can use for each loop. enhanced for loop, or advanced for loop
		
		String[] iceCream= {"vanilla", "chocolate", "pistachio", "kulfi", "Mango"}; 
		
		for(String flavor:iceCream) {
			
			System.out.println(flavor);
			
			
			System.out.println("-------------------------");
			
			
			char[] letters= {'A', 'B', 'C', 'D'};
			
			for(char letter:letters) {
				
				System.out.println(letter);
				
				System.out.println("----------------------------------");
				
				
				int[] numbers= {12, 56, 345, 1, 0, 9};
				
				//get all elements using regular for loop
				
				for(int i=0; i<numbers.length; i++) {
					
					System.out.println(numbers[i]+" ");
					
					
					System.out.println("---------------------------------");
					
					
					//get all values using enhances for loop
					
					for(int num :numbers) {
						
						System.out.println(num);
						
						
					}
					
					
				}
			
			
			}
			
			
		}
		
		

	}

}
