package day30.stringdemo;

import java.util.StringTokenizer;

public class StringDemo7 {

	public static void main(String[] args) {
		String sentence = "Hello, I am Santosh Karna, I am from Kathmandu, Nepal, I am Java Developer, I teach Java part time";

		StringTokenizer st = new StringTokenizer(sentence, ",");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("====================");

		String[] words = sentence.split(",");
		System.out.println(words.length);
		for (String w : words) {
			System.out.println(w);
		}
	}

}
