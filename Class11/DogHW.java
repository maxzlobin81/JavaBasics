package Class11;

public class DogHW {
	
	String breed;
    String color;
    int age;
    String fur;
    
    void friendly() {
    	  	System.out.println("wiggling its tale...");
  }
    void aggressive() {
    	System.out.println("loudly barking");
  }
  
    public static void main(String[] args) {
    	
    	DogHW Husky=new DogHW();
    	Husky.breed="Siberian";
    	Husky.color="White";
    	Husky.age=10;
    	Husky.fur="Fluffy";
    	
    	DogHW Bulldog=new DogHW();
    	Bulldog.breed="whatever breed";
    	Bulldog.age=5;
    	Bulldog.fur="smooth";
    	
    	DogHW Labrador=new DogHW();
    	Labrador.breed="Retriever";
    	Labrador.color="Black";
    	Labrador.age=2;
    	Labrador.fur="Persian Lamb";
    	
    	System.out.println(Labrador.breed+" with "+Labrador.fur+ " fur");
    		Labrador.aggressive();
   
    	}
    }
    
    
    
    
   

