package Class9;

public class HW1 {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String [] cars= {"Honda", "Nissan", "Audi", "Kia", "Toyota", "BMW"}; 
		
		for(int i=0; i<cars.length; i++) {
			
			System.out.println(cars[i]);
			
		}
			
			
		System.out.println("-------------------------------");
		
		for(String each :cars) {
			
			System.out.println(each);
			
			
			
		}
			
			
			
			
			
		}

	}


