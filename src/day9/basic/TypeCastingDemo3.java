package day9.basic;

public class TypeCastingDemo3 {

	public static void main(String[] args) {
		char c1 = 97;
		short s1 = 97;
		System.out.println(c1);// a
		System.out.println(s1);// 97
		
		char c2 = 'a';
		short s2 = 'a';
		System.out.println(c2);// a
		System.out.println(s2);// 97
		
		char c3 = 65;
		short s3 = (short)c3;
		
		System.out.println(c3);
		System.out.println(s3);
		
		short s4 = 67;
		char c4 = (char)s4;
		System.out.println(s4);
		System.out.println(s4);
	}

}
