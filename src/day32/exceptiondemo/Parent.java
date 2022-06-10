package day32.exceptiondemo;

import java.text.ParseException;

public class Parent {

	public int m1(int a) throws ArithmeticException {
		return a;

	}

	public int m2(int a) throws Exception {
		return a;
	}

	public int m3(int a) throws ArithmeticException {
		return a;
	}

	public int m4(int a) throws ParseException {
		return a;
	}
}
