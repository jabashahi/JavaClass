package day8.bsasic;

public class OperatorsDemo6 {

	public static void main(String[] args) {
		// Conditional(Ternary) Operators ?;

		int a = 1;
		int b = 4;
		if (a > b) {
			System.out.println("a is greater than b.");
		} else {
			System.out.println("b is greater than a.");
		}

		boolean isGreater = (a > b) ? true : false;
		System.out.println(isGreater);
		String greater = (a > b) ? "a is greater than b." : "b is greater than a.";
		System.out.println(greater);

	}

}
// block => { }