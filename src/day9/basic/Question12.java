package day9.basic;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = input.next();
		System.out.println("Enter age: ");
		int age = input.nextInt();
		System.out.println("Enter nationality: ");
		String nationality = input.next();
		
		System.out.println("=======================");
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
		System.out.println("Nationality is: "+ nationality);
		System.out.println("******************************");
	}

}
