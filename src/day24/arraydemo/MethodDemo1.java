package day24.arraydemo;

public class MethodDemo1 {

	public int[] getArray() {
		int[] ar = { 4, 5, 6 };
		return ar;
	}

	public void printArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		MethodDemo1 ob = new MethodDemo1();
		int[] ar = ob.getArray();
		ob.printArray(ar);
	}

}