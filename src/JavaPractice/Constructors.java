package JavaPractice;

public class Constructors {

	String name; // Declaration of a variable. No value has been assigned
	 int age;
	 String address;
	

	Constructors(){ //zero params
		name = "Javid";
		age = 31;
		address = "newyork";
	}
	Constructors(String firstname){// one params
		name = firstname;
		//age = ageyear;
		//address = addresslocation;
		
		
	}
	Constructors(String firstname, int ageyear, String addresslocation ){//multiple params
		name = firstname;
		age = ageyear;
		address = addresslocation;
		
		
	}
	void display() {
		System.out.println(name+ " " +age+ " " +address+"."+"\t\"thats it!\""+"\n no more questions"); //Examples of escape sequence
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructors demo1 = new Constructors();
Constructors demo2 = new Constructors("Javid",36,"newyork");
Constructors demo3 = new Constructors("Javid");
demo1.display();
demo2.display();
demo3.display();
	}

}
