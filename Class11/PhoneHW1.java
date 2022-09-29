package Class11;

public class PhoneHW1 {
	
	String model;
	String color;
	int year;
	boolean durable=true;
	
	
	void ring() {
		System.out.println("Ringing........");
	    }
		
		void call() {
			System.out.println("Calling......");
			}
			
			void update() {
				System.out.println("Updating");
				}

	
public static void main(String [] args) {
	
        PhoneHW1 iphone=new PhoneHW1();
        iphone.model="Pro Max 13";
        iphone.color="White";
        iphone.year=2022;
        iphone.durable=true;
        
        
        PhoneHW1 android=new PhoneHW1();
        android.model="S22";
        android.color="Black";
        android.year=2021;
        android.durable=true;
        
        PhoneHW1 nokia=new PhoneHW1();
        nokia.model="whatever model";
        nokia.color="Grey";
        nokia.year=2002;
        nokia.durable=false;
        
        
        System.out.println("Nokia from "+nokia.year+" in color ");
        System.out.println(android.color);
        
        iphone.call();
        
     }
}	


