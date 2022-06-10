package day17.methodconcept;

public class MethodDemo2 {

	// <access modifier> <return type> <method name> () {
	// ===========
	// ===========
	// return matching value with return type;
	// }
	public int addition() {
		int a = 5;
		int b = 6;
		int sum = a + b;
		return sum;
	}

	// <access modifier> <return type> <method name>(any type and any numbers of
	// parameter) {
	// ===========
	// ===========
	// return matching value with return type;
	// }
	public String greeting(String name, String location) {
		String msg = "Hello, " + name + " from " + location + ", Good Morning.";
		return msg;
	}

	public static void main(String[] args) {
		MethodDemo2 obj = new MethodDemo2();
		int sum = obj.addition();
		System.out.println("Sum is: " + sum);

		String name = "Hari";
		String location = "Kathmandu";
		String msg = obj.greeting(name, location);
		System.out.println(msg);
	}

}
