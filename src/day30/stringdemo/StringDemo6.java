package day30.stringdemo;

import java.util.StringTokenizer;

public class StringDemo6 {

	public static void main(String[] args) {
		String sentence = "Hello, I am Santosh Karna, I am from Kathmandu, Nepal, I am Java Developer, I teach Java part time";
		StringTokenizer st = new StringTokenizer(sentence);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("====================");

		st = new StringTokenizer(sentence, " ,");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
