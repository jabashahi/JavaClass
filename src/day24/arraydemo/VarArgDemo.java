package day24.arraydemo;

public class VarArgDemo {

	public void printArray(int... ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}

	public static void main(String[] args) {
		int[] ar = { 3, 5, 7 };
		VarArgDemo ob = new VarArgDemo();
		ob.printArray(ar);
		ob.printArray(4, 5, 6, 8, 9);

	}

}
