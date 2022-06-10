package day17.methodconcept;

import java.util.Scanner;

public class ConsoleProjectTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ConsoleProject project = new ConsoleProject();
		String decision = " ";
		
		
		do {
		System.out.println("Enter operation: info|evenOdd|factorial ");
		String choice = input.next();

		
		switch (choice) {
		case "info":
			System.out.println("Enter name: ");
			String name = input.next();
			System.out.println("Enter age: ");
			int age = input.nextInt();
			System.out.println("Enter salary: ");
			double salary = input.nextDouble();
			System.out.println("Enter eligibility: ");
			boolean isEligible = input.nextBoolean();
			project.displayInfo(name, age, salary, isEligible);
			
			break;
		case "evenOdd":
			System.out.println("Enter number: ");
			int n = input.nextInt();
			project.findEvenOdd(n);
			break;
		case "factorial":
			int number = input.nextInt();
			int factorial = project.findFactorial(number);
			System.out.println("Factorial of " + number + " is " + factorial);
		break;
		
			default:
				System.out.println("Wrong selection!!! Try again.");
				break;
		}
		System.out.println("Do you want to continue? Please press Y|N");
		decision = input.next();
	} while(decision.equalsIgnoreCase("Y"));
		
		System.out.println("Bye Bye!!! See you again.");

}

	}


