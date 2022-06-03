package JavaPractice;

public class inheritance extends Vehicle { //After extends keyword we identify the parent class (Vehicle)

	
	int numberofWheels= 6;//child class variable 
	
	 
	 void run() {
		 System.out.println(super.numberofWheels);// After the super. we have the parent class variable which is a duplicate.
		 /*numberofWheels is from the parent or inherited class.
		 Thus we can make distinction between the parent class variable and child class variable */
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance demo1;
		
		demo1 = new inheritance();
		
		System.out.println(demo1.brandname);// This is inheritance of a variable
		
		demo1.run();
		
		
		
		demo1.start();
		System.out.println(demo1.accelerate());
	
		System.out.println(accelerate());
	}
	

}
