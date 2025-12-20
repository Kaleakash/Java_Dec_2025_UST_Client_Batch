package polymorphism;
class Operation {
	void add() {				// no passing parameter 
		System.out.println(10+20);
	}
	void add(int x) {			// passing 1st parameter 
		System.out.println(x+20);
	}
	void add(int x, int y) {			// passing 1st parameter and 2nd parameter value is int 
		System.out.println(x+y);
	}
	void add(float x,float y) {			// passing 1st parameter and 2nd parameter but value is float 
		System.out.println(x+y);
	}
	void add(String x,String y) {			// passing 1st parameter and 2nd parameter but value is float 
		System.out.println(x+y);
	}
//	String add(String x,int y) {			// passing 1st parameter and 2nd parameter but value is float 
//		return x;
//	}
//	String add(int x,String y) {			// passing 1st parameter and 2nd parameter but value is float 
//		return y;
//	}
}
public class MethodOverloadingExamples {

	public static void main(String[] args) {
	Operation op = new Operation();
	op.add(10);
	op.add();
	op.add(10.0f, 20.0f);
	op.add(1,2);
	op.add("10","20");			// 1020
	}

}
