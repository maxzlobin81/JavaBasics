package Class11;

public class Dog {
	
	//State
	//attributes/properties/fields
	
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	
	//these are the behaviors of a dog
	// methods or functions
	void bark() {
		
		System.out.println("Barking.........");
	}

	void sleep() {
		
		System.out.println("Dog is sleeping......");
	}
	
	public static void main(String[] args) {
		//creating object from a class
		//new Dog(); it creates an object of class Dog
		Dog dog1=new Dog();
		//calling a behavior on an object
		dog1.bark();
		dog1.sleep();
		
		
		
	}

}
