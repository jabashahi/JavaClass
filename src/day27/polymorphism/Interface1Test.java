package day27.polymorphism;

public class Interface1Test {

	public static void main(String[] args) {

		Interface1 ob = new Interface1Impls();
		ob.greet();
		System.out.println(Interface1.a);
		
		ob = new Interface1Impls();
		ob.greet();
		System.out.println(Interface1.a);
		
		Interface1 o = new Interface1Impls();
		System.out.println(o.a);
		
	}

}
