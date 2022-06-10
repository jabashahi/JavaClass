package day31.exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b = input.nextInt();

		try {
			System.out.println("inside try start ");
			int result = divide(a, b);
			System.out.println("Division is: " + result);
			System.out.println("inside try end");
		} catch (ArithmeticException ae) {
			System.out.println("inside catch");
		} finally {
		// finally always runs
			System.out.println("inside finally");
			input.close();
		}
		System.out.println("==========end==============");
	}

	public static int divide(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

}
