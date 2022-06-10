package day25.inheritancedemo;

public class SuperTest {

	public static void main(String[] args) {
		Super sup = new Super();
		
		System.out.println("==================");

		Sub sub = new Sub();
		
		System.out.println("==================");

		Sub su = new Sub(5);
	}

}
