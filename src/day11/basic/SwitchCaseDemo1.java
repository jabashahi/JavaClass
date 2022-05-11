package day11.basic;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice: ");
		
		int choice = 1;
		switch (choice) {

		case 1:
			System.out.println("This is addition");
			break;
			
		case 2:
			System.out.println("This is subtraction");
			break;
			
		case 3:
			System.out.println("This is multiplication");
			break;
			
		case 4:
			System.out.println("This is division");
			break;
			
		default:
			System.out.println("Wrong choice!!!");
		}
		System.out.println("exit");
	}

}
