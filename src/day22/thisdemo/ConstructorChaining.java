package day22.thisdemo;

public class ConstructorChaining {

	public ConstructorChaining() {
		this(4);
		System.out.println("default constructor.");
	}

	public ConstructorChaining(int a) {
		this(a, 5);
		System.out.println("1 arg constructor.");
	}

	public ConstructorChaining(int a, int b) {
		System.out.println("2 arg constructor.");
	}

	public static void main(String[] args) {
		ConstructorChaining c1 = new ConstructorChaining();

	}

}
