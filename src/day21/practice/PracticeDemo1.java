package day21.practice;

import java.util.Scanner;

import day17.methodconcept.ConsoleProject;

public class PracticeDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PracticeDemo project = new PracticeDemo();
		System.out.println("Enter choice: ");
		String choice = input.next();

		
		switch (choice) {
		case "printthetable":
			System.out.println("Enter number: ");
			int number = input.nextInt();
			project.printTheTable(number);
			break;
			
		case "mathsqrt":
			System.out.println("Enter the value of a: ");
			double a = input.nextDouble();
			System.out.println("Enter the value of b: ");
			double b = input.nextDouble();
			System.out.println("Enter the value of c: ");
			double c = input.nextDouble();
			project.mathSqrt(a, b, c);
			break;
		
			default:
				System.out.println("Wrong selection!!! Try again.");
				break;
		}
	}

}
