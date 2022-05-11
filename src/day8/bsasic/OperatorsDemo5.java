package day8.bsasic;

public class OperatorsDemo5 {

	public static void main(String[] args) {
		// Increment/Decrement Operator
		// ++ --
		// post pre
		// a++ a-- --a
		int a = 5;
		System.out.println(a);
		++a;

		int b = 8;
		System.out.println(b);// 8
		System.out.println(b++);// 9
		System.out.println(b);// 8

		int m = 2;
		int n = m++;
		System.out.println(m);// 2
		System.out.println(n);// 3

		int x = 9;
		x = (x++) + (++x) + x + 2;
		x = 9 + 11 + 11 + 2;
		System.out.println(x);// 33
		System.out.println();

	}

}
