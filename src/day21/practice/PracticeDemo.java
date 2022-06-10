package day21.practice;

public class PracticeDemo {

	public void printTheTable(int number) {
		for (int i = number; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
	}

	public void mathSqrt(double a, double b, double c) {
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area of triangle is: " + area);
	}

}
