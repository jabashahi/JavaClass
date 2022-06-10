package day13.objectdemo;

public class StaticDemo {
	// static variable
	static String studentName = "Raju";

	// static method
	public static void greet() {
		System.out.println("Hello, Good Morning from Nepal.");
	}

	public static void main(String[] args) {
		System.out.println(studentName);// direct access
		greet();

		// best/recommended approach
		System.out.println(StaticDemo.studentName);
		StaticDemo.greet();
	}

}
