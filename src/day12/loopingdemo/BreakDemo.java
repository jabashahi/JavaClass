package day12.loopingdemo;

public class BreakDemo {

	public static void main(String[] args) {
// break is uses in switch and loop only.

		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				break;

			}
			System.out.println(i);
		}
		System.out.println("Loop Terminated !!!");
	}

}
