package day8.bsasic;

public class OperatorsDemo4 {

	public static void main(String[] args) {
		// Logical Operator: &&(and) ||(or) !(not)
		int a = 6, b = 7, c = 8;
		System.out.println(true && true);// true
		System.out.println(a < b && a < c);// true
		System.out.println(true && false);// false
		System.out.println(a < b && a > c);// false
		System.out.println(false && true);// false
		System.out.println(a > b && a < c);// false
		System.out.println(false && false);// false
		System.out.println(a > b && a > c);// false

		System.out.println("========================");
		System.out.println(true || true);// true
		System.out.println(a < b || a < c);// true
		System.out.println(true || false);// true
		System.out.println(a < b || a > c);// true
		System.out.println(false || true);// true
		System.out.println(a > b || a < c);// true
		System.out.println(false || false);// false
		System.out.println(a > b || a > c);// false

		System.out.println("**************************");
		System.out.println(!true);// false
		System.out.println(!(a < b));// false
		System.out.println(!false);// true
		System.out.println(!(a > b));// true
	}

}
