package day24.arraydemo;

public class ArrayDemo9 {

	public static void main(String[] args) {
		int[][] jj = new int[3][];

		jj[0] = new int[1];
		jj[0][0] = 10;

		jj[1] = new int[2];
		jj[1][0] = 13;
		jj[1][1] = 15;

		jj[2] = new int[3];
		jj[2][0] = 16;
		jj[2][1] = 18;
		jj[2][2] = 19;

		for (int i = 0; i < jj.length; i++) {
			for (int k = 0; k < jj[i].length; k++) {
				System.out.print(jj[i][k] + " ");
			}
			System.out.println();
		}
	}

}
