package day22.thisdemo;

public class ThisDemo33 {
	
	public void sayHello() {
		System.out.println("Hello, Good Morning!!!");
	}

	public void greet(ThisDemo33 o) {
		o.sayHello();
	}

	public void greetings() {
		//ThisDemo33 o = new ThisDemo33();
		//greet(o);
		greet(this);
	}

	public static void main(String[] args) {
		ThisDemo3 obj = new ThisDemo3();
		obj.greetings();
	}
}
