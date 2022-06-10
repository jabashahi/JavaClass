package day25.inheritancedemo;

public class Sub extends Super {
	
	public Sub() {
		super(5);
		System.out.println("child default constructor");
	}

	public Sub(int a) {
		super();
		System.out.println("child parameterised constructor");
	}
}
