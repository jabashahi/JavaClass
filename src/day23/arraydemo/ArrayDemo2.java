package day23.arraydemo;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[3];

		// to take input
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element: ");
			arr[i] = input.nextInt();
		}

		// to print an elements of an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		input.close();
	}

}
