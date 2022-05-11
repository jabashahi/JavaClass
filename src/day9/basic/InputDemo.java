package day9.basic;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = input.next();
		System.out.println("Name is: " + name);

		System.out.println("Enter any characters: ");
		char ch = input.next().charAt(0);
		System.out.println("Character is: " + ch);

		// byte b = input.nextByte();
		// short s = input.nextShort();
		// int a = input.nextInt();
		// long l = input.nextLong();
		// float f = input.nextFloat();
		// double d = input.nextDouble();
		// boolean bb = input.nextBoolean();

	}

}
