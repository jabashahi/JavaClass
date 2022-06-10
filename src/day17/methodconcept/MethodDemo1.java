package day17.methodconcept;

public class MethodDemo1 {

	// <access modifier> void <method name>() {
	// ===========
	// ===========
	// }

	// method definition
	public void sayHello() {
		System.out.println("Hello Hello Hello.....");
	}

	// <access modifier> void <method name>(any type and any numbers of parameter) {
	// ===========
	// ===========
	// }
	public void displayInfo(String name, int age, double salary, boolean isEligible) {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Salary is: " + salary);
		System.out.println("Eligibility is: " + isEligible);
	}

	public static void main(String[] args) {
		System.out.println("main start");
		MethodDemo1 obj = new MethodDemo1();
		// method calling
		obj.sayHello();

		System.out.println("========================");
		String name = "ram";
		int age = 22;
		double salary = 5000.05;
		boolean isEligible = true;
		obj.displayInfo(name, age, salary, isEligible);
		System.out.println("=========================");
		obj.displayInfo("raju", 33, 3005.05, false);

		System.out.println("main end");

	}
}
