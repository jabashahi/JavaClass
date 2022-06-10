package day26.abstractandinterfacedemo;

//we can not inherit final class
public /*final*/ class FinalDemo {
	
	
	// we use final keyword on variable to make constants
	// final variable must be initialized at the time of declaration
	//we can not change the value of final variable
	final int a = 5;
	
	// we can not override final method
	public /*final*/ void greet() {
		System.out.println("Hello, Good Morning...");
	}

	//final int b;
	//we can not use final variable on constructor
	//public /*final*/ FinalDemo(int b) {
		//this.b = b;
		
	//}
}
