package day17.methodconcept;

public class ConsoleProject {

	public void findEvenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is an even number.");
		} else {
			System.out.println(n + " is an odd number.");
		}

	}

	public int findFactorial(int n) {
		if (n <= 0) {
			return 0;
		}
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public void displayInfo(String name, int age, double salary, boolean isEligible) {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Salary is: " + salary);
		System.out.println("Eligibility is: " + isEligible);
	}

}
