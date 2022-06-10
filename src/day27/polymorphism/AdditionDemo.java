package day27.polymorphism;

public class AdditionDemo {

	public void add(int a, int b) {
int sum = a + b;
System.out.println("1. sum is: " + sum);
	}

	public void add(double a, double b) {
		double sum = a +b;
		System.out.println("2. sum is: " + sum);
	}

	public void add(int a, int b, int c) {
int sum = a+b+c;
System.out.println("3. sum is: " + sum);
	}
	public static void main(String[] args) {
		//compile time polymorphism static binding
		// which can be achieved by overloading of method
		AdditionDemo ob = new AdditionDemo();
		ob.add(4.5,3.4);
		ob.add(4, 7);
		ob.add(4, 7, 9);
	}
	
}
