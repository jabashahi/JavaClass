package day32.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b = input.nextInt();
		int result = divide(a, b);
		System.out.println("division is: " + result);
		} catch (ArithmeticException | InputMismatchException ae) {
			System.out.println(ae);
			input.close();
		}
		System.out.println("==========end==============");
	}

	public static int divide(int num1, int num2) {
		int div = num1 / num2;
		return div;


	}

}
