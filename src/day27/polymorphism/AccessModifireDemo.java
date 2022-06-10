package day27.polymorphism;

public class AccessModifireDemo {
	// String
	String deafaultVar = "this is default variable";
	public String publicVar = "this is public variable";
	private String privateVar = "this is private variable";
	protected String protectedVar = "this is protected variable";

	// method
	void defaultMehtod() {
		System.out.println("this is default method. ");
	}

	public void publicMethod() {
		System.out.println("this is public method. ");
	}

	private void privateMethod() {
		System.out.println("this is private method. ");
	}

	protected void protectedMethod() {
		System.out.println("this is protected method. ");
	}
	
	//constructor
	public AccessModifireDemo() {
		System.out.println("this is public constructor. ");
		
	}
	//default constructor
	AccessModifireDemo(int a) {
		System.out.println("this is default constructor. ");
}
	//protected constructor
	protected AccessModifireDemo(int a, int b) {
		System.out.println("this is protected constructor. ");
		
	}
	//private constructor
	private AccessModifireDemo(int a, int b, int c) {
		System.out.println("this is private constructor. ");
}
	public static void main(String[] args) {
		AccessModifireDemo ob = new AccessModifireDemo(4,5,6);
		ob.publicMethod();
		ob.protectedMethod();
		ob.defaultMehtod();
		ob.privateMethod();
	}
}