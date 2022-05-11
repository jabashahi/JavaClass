package day9.basic;

import java.util.Scanner;

public class Q10c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the alue of a: ");
		double a = input.nextDouble();
		System.out.println("Enter the value of b: ");
		double b = input.nextDouble();
		System.out.println("Enter the value of c: ");
		double c = input.nextDouble();

		double x = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		System.out.println("x is: " + x);

		input.close();
	}
}
