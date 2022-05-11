package day11.basic;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Operation: ");
		char operator = input.next().charAt(0);
		System.out.println("Enter a : ");
		int a = input.nextInt();
		System.out.println("Enter b : ");
		int b = input.nextInt();

		switch (operator) {
		case '+':
			int sum = a + b;
			System.out.println("Sum is : " + sum);
			break;
		case '-':
			int sub = a - b;
			System.out.println("Subtraction is : " + sub);
			break;
		case '*':
			int mul = a * b;
			System.out.println("Multipication is : " + mul);
			break;
		case '/':
			int div = a / b;
			System.out.println("Division is : " + div);
			break;
		default:
			System.out.println("Wrong operator selection!!!");
		}
		System.out.println("exit");
	}

}


