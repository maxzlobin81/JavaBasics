package Class9;

public class ArrayDemo {

	public static void main(String[] args) {
		// store elements inside an array
		
		
		int[] arr=new int[4]; 
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		
		//accessing elements from the array
		
		System.out.println(arr[2]);
		System.out.println(arr[1]+arr[2]);
		
		
		// let's create an array and store your classmates
		
		
		String[] names=new String[5];
		
		names[0]="Shah";
		names[1]="Max";
		names[2]="Bob";
		names[3]="Zac";
		names[4]="Dennis";
		
		System.out.println("Hello "+names[1]);
		

	}

}
