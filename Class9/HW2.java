package Class9;

public class HW2 {

	public static void main(String[] args) {
		// Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
		
		String [] animals= {"panda", "lion", "horse", "dog", "cat"}; 
		
		for(int x=0; x<animals.length; x++) {
			
			System.out.println(animals[x]);
			
			
			}
		
		System.out.println("-----------------------------------");
		
		for(String better:animals) {
			
			System.out.println(better);
			
			
		}
		
		

	}

}
