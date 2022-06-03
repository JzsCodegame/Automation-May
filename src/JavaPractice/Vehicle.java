package JavaPractice;

public class Vehicle {
	         //This section reflects the attributes defined as variables with different data types.
	 public String brandname = "Rav4";
	 	
	 String color = "Red";
	 		
	 		 static int Convert = 4;
             String  model = "3ys76";
           
             public static int buildYear = 2021;
               
              
             final int numberofseats = 5; //Final Variable can not be reassigned. Meaning it can only have single value.
                      
             double Enginecapacity = 2.5;
                        
             String EngineType = "V6";
                        
                     public  int price = 30565; //Instance variable as well as Global Variable. 
                    
                     
                     public static int numberofWheels= 4; //Static or Global variable. We declared the variable at Class Level or Area.
                   
                    
                     public void start() {  //This is a user defined Method.User defined means created by the user.
                    	               // This is also a Instance Method
                    	
                    	String  Steer = "All Wheel Drive";// This is a local variable. We need to declare local variable inside a method.
                        
                        System.out.println(Steer);

              		 
              		
              		 //numberofseats = 6;
                        System.out.println(buildYear + numberofseats);//Static variables can be accessed from anywhere in the class.
                        //If any questions or doubts about system.out.println(). It is one of many Java's internal predefined method 
                    }
                     void changegear() {  //Instance method
                    	 start(); // An instance method can be directly access from a another instance method.
                    	 String Gear = "automatic";
                    	 System.out.println("Car gear changed to drive");
                     }
                     
                     public static int accelerate() { //This is a static method. Because we have added the static keyword
                    	 
                    	  int speed = 60;
						return speed; //Return keyword has to be used to return the data-type defined before the method.
                     }
	public static void main(String[] args) { //This is Java's main method. We need this method to execute Java program. This is a predefined method. 
		// TODO Auto-generated method stub
		
		Vehicle Rav4;// Rav4 is an Object of class Vehicle.
		 
		String company = "Toyota"; //This is also a local variable.
		
		Rav4 = new Vehicle();// Here we are using
		 
		System.out.println(company);
		  
		System.out.println(Rav4.price);// If the variable is not static then we need to create an object (Rav4) of the class (Vehicle) to access.
		  
		  System.out.println(numberofWheels); // To access a Static variable we don't need the object of the class.
            
		 // System.out.println(Steer);// This is an example of Local variable. Which can not be accessed directly.
		  
		  Rav4.start(); // This is how we need access local variable from same class. We need to use the object of the class.
		 
		  
		 Rav4.changegear();// This is instance method and can only be accessed with the object of the class.
		  
		  System.out.println(Vehicle.accelerate()); //Static method can be directly accessed using the class
		  
		  System.out.println(Rav4.accelerate());//As well as using the object of the class.
		   
		  accelerate(); // Access the static method directly.
		  
		 String X = String.valueOf(Convert);//integer was converted into a string for validations purpose.
		 System.out.println(X);
}
                   

}