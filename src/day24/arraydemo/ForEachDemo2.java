package day24.arraydemo;

public class ForEachDemo2 {

	public static void main(String[] args) {
		double[][] d = new double[][] { { 2.3, 3.4, 4.5 }, { 1.2, 5.6, 6.7 }, { 8.9, 3.2, 5.4 } };

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("===============");
		for (double[] ar : d) {
			for (double a : ar) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
