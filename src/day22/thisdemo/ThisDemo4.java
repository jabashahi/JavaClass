package day22.thisdemo;

public class ThisDemo4 {

	public ThisDemo4 returnObject() {
		// ThisDemo4 obj = new ThisDemo4();
		return this;
	}

	public void greet() {
		System.out.println("Hello, Good Evening...");
	}

	public static void main(String[] args) {
		ThisDemo4 o = new ThisDemo4().returnObject();
		o.greet();
	}

}
