package JavaPractice;

public class Buyer {
	
	static String name; // Declaration of a variable. No value has been assigned.
	static int age;
	static String address;
	int DoB;
	String phone;
	double height;
	int income;
	int ssn;
	int credit;
	boolean license;
	double licensenumber;
	boolean insurance;
	
	
	
	/*Constructors are special type of method.
              We can use constructors to initialize parameters and objects.
                      We can manipulate data based on the parameters and variables defined as attributes. */
	
Buyer(){  // This is a Constructor without parameters. Can be run directly from the main method.
		name = "Shuvo";   // Variable name has been initialized the variables based on assigned value which is "Shuvo". This also called Initialization
		age = 30;
		address = "new york";
		
	}
	
	void display() { //Instance method
		System.out.println(name+ " " +age+ " " +address );// This method will be called for overloading.
	}
	
	Buyer(String name, int age, String address, boolean license, double licensenumber){  //This an example of one o multiple parameter constructor.
		this.name = name;        // "this" keyword refers to the class Buyer. this way we can make distinction between the parameter and variables. 
		                         /* this.name is also like Buyer.name. It identifies as variable. 
		                          * So if the naming of parameters is duplicates then we can identify... which one is a parameter..and which one is variable.
		                          */
		this.age = age;             // We can also associate parameters and variables together by equal sign.
		this.address = address;
		this.license = license;
		this.licensenumber= licensenumber;
	                                 // Once the parameters have been associated with variables. Then It is not required for us assign values to the parameter.
		System.out.println(name +" "+"="+ age +" "+ address);
		
		if (license == true) {
			System.out.println("Buyer is Qualified");
		}
		//else if (license != true) {
		//	System.out.println("Buyer is not Qualified");
		//}
		else if (license == false) {
			System.out.println("Again ..Buyer is not Qualified");
		}
		if (licensenumber == 10.5) {
			System.out.println("Valid License number");
		}
		else if(licensenumber <= 5) {
			System.out.println("InValid License number");
		}
		else if(licensenumber >= 6) {
			System.out.println("Valid License number");
		}
		else if(licensenumber > 10) {
			System.out.println("InValid License number");
		}
			else {
				System.out.println("Conditions Failed");
			}
	
	while(licensenumber <= 2) {
		System.out.println("Error012");
		licensenumber++;
		
	}
	for (int i = 500;i >= 50;i++) {
		System.out.println(i);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Buyer demo1 = new Buyer(); // demo1 is an object of class Buyer. We initialize using the "new" keyword with Buyer() constructor.
		
		demo1.display();  // This is a way we overload a constructor. We use the object to call the method. The method uses the Constructor Data or values.
		
		
	
      Buyer Mujeeb = new Buyer();/*Buyer() is the default constructor with no parameter. 
                                   Just running the default constructor which doesn't have a method overloaded will not print any values*/
            Mujeeb.display();

      
      Buyer Mujeeb2 = new Buyer();//
      Mujeeb2.display();
      
      
      Buyer Habib = new Buyer("Habib", 28,"virginia",false, 0);
      
      /*Buyer Habib = new Buyer("Habib", 28, "virginia");// Using constructors with different and different values.
	  Buyer Tori = new Buyer("Tori", 25, "florida");
	  Buyer Shuvo = new Buyer("Shuvo", 26, "california");
	 Shuvo.data();  */
	
	}

}
