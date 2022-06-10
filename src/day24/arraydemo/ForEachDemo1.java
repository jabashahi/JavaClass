package day24.arraydemo;

public class ForEachDemo1 {

	public static void main(String[] args) {

		int[] ar = { 4, 5, 6 };

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("========Enhanced for loop=========");
		
		for (int a : ar) {
			System.out.println(a);
		}

	}

}
