package Class8;

public class task3 {

	public static void main(String[] args) {
		// print numbers from 1 to 50 except those that are divisible by 3
		
		for(int x=1; x<=50; x++) {
			
			if(!(x%3==0)) {
				
				continue;
			}
				
				System.out.print(x+" ");
				
				
			}
		}

	}


