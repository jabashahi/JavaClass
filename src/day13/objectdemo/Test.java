package day13.objectdemo;

public class Test {

	public static void main(String[] args) {
		
		NonStaticDemo obj = new NonStaticDemo();
		System.out.println(obj.name);
		obj.sayHello();
		
		//System.out.println(studentName);// direct access
		//greet();

		// best/recommended approach
		System.out.println(StaticDemo.studentName);
		StaticDemo.greet();
	}

}
