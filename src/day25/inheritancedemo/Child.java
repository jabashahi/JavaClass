package day25.inheritancedemo;

public class Child extends Parent {

	String name = "I am Child";

	public void greet() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("hello, good morning from child");
		super.greet();
	}

}
