package day9.basic;

import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		System.out.println("Value of a before swapping: " + a);
		System.out.println("Value of b before swapping: " + b);
		int temp = a;//4
		a = b;//5
		b = temp;//4
		System.out.println("Value of a before swapping: " + a);
		System.out.println("Value of b before swapping: " + b);
		
	}

}
