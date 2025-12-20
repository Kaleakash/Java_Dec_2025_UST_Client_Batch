package polymorphism;
class Bike {
	void speed() {
		System.out.println("Bike generic speed : 60km/hr");
	}
}
class Honda extends Bike {
	void color(String cname) {
		System.out.println("Honda bike color "+cname);
	}
}
class Pulsar extends Bike {
	//@Override
	void color(String cname) {
		System.out.println("Pulsar bike color "+cname);
	}
	@Override
	void speed() {
		System.out.println("Pulsar bike speed : 90km/hr");
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
	// 1st option 
//		Honda hh = new Honda();
//		hh.color("Red");
//		hh.speed();
//		Pulsar pu = new Pulsar();
//		pu.color("Gray");
//		pu.speed();
		
		//showing the proof speed method overriding 
//		Pulsar pu = new Pulsar();
//		pu.speed();
		
	
		// with object style 
		Bike bb = new Bike();		// creating super class object 
		bb.speed();						// only super class code 
		//bb.color("RED");
		
	Pulsar pu = new Pulsar();			// creating sub class object 
		pu.speed();                        	// if pulsar class override we get override code else we get super class code 
		pu.color("Black");	   				// sub class own method 
		
	Bike bb1 = new Pulsar();		// creating sub class object and super class reference : possible. 
	//Pulsar pu1 = new Bike();		// creating super class object and sub class reference not possible 
	bb1.speed();				// with help of bb1 we can call only those method part of super class or override we can't call sub class own method 
	//bb1.color("Black")
		
	}

}
