package JavaPractice;

public class Ifelse {

	  
	public static int accelerate(int speed) { //This is a static method. Because we have added the static keyword
     	 
    	 //int speed = 60;
		
    	  if(speed > 60) {
    		  System.out.println("Break");
    	  }
    	  else {
    		  System.out.println("Keep Driving"); //Return keyword has to be used to return the data-type defined before the method.
    	  }
    	  return speed;
	  
	  }
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Ifelse run = new Ifelse();
     System.out.println(accelerate(60));// The method is parameterized as if it is carrying a container. Which can loaded with values.
	
	}

}
