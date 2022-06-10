package day32.exceptiondemo;

public class ExceptionDemo8 {

	public static void main(String[] args) {
		vote(8);
		System.out.println("==============");
	}

	public static void vote(int age) {
		if (age >= 18) {
			System.out.println("you can vote...");
		} else {
			throw new InvalidAgeException("you can not vote...");
		}
	}

}
