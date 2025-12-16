
public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int age=21;		// 4 byte 
		//byte age = 21;		// 1 byte 
		//byte age = 21;		// range -128 to 127
		byte a=100;
		short b=a;		// implicit type casting 
		System.out.println("a "+a);
		System.out.println("b "+b);
		short c = 127;
		byte d = (byte)c;   // explicit type casting 
		System.out.println("c "+c);
		System.out.println("d "+d);
		System.out.println("---------------");
		int e = 100;
		float f = e;		// implicit type casting 
		System.out.println("e "+e);
		System.out.println("f "+f);
		//float g = (float)100.10;	// explicit type casting 
		float g = 100.12f;			// explicit type casting 
		int h = (int)g;		// explicit type casting 
		System.out.println("g "+g);
		System.out.println("h "+h);
		
	}

}
