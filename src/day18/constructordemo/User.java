package day18.constructordemo;

public class User {

	String username;
	String password;

	public User(String u, String p) {
		System.out.println("constructor called");
		username = u;
		password = p;
	}
	// public void assignInfo(String u, String p) {
	// username = u;
	// password = p;
	// }

	public void displayInfo() {
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
	}

	public static void main(String[] args) {
		User santosh = new User("santoshkarna", "abc@123");
		// santosh.assignInfo("santoshkarna", "abc@123");
		santosh.displayInfo();

		System.out.println("====================");

		User raju = new User("rajuraj", "def@456");
		// raju.assignInfo("rajurai", "def@456");
		raju.displayInfo();

	}

}
