package day24.arraydemo;

public class Demo {

	public static void main(String[] args) {
		System.out.println("main");
		if (args.length > 0) {
			Demo.printNames1(args);

		}
	}
	//valid
	public static void printNames1(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	public static void printNames2(String names[]) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	//valid
	public static void printNames3(String... names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
