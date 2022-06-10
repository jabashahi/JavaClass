package day20.encapsulationdemo;

//Shadowing is the process of hiding instance variable by local variable of same name and same type
//inside non-static method or constructor of a class.
//This: is a keyword and is an implicit reference variable of current object
//an current type. 'this' is available only inside non-static method and constructor of class.
// 'this' is a final variable which is not change the value of object.

public class ThisDemo1 {

	// instance variable
	private int a = 5;

	public void printData() {
		System.out.println("this is: " + this);
		System.out.println(a);
		// local variable
		int a = 6;
		System.out.println(a);
		// ThisDemo1 obj1 = new ThisDemo1();
		int sum = a + this.a;
		System.out.println("Sum is: " + sum);
	}

	// public static void a () {
	// ThisDemo1 ob = new ThisDemo1();
	// System.out.println(ob.a);
	// int a = 6;
	// System.out.println(a);

	public static void main(String[] args) {
		ThisDemo1 obj1 = new ThisDemo1();
		System.out.println("Obj1 is: " + obj1);
		obj1.printData();

		System.out.println("==================");
		ThisDemo1 obj2 = new ThisDemo1();
		System.out.println("Obj1 is: " + obj2);
		obj2.printData();
	}

}
