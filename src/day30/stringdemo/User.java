package day30.stringdemo;

public class User {

	String username;

	public User(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return username;
	}

	public static void main(String[] args) {
		User u = new User("Santosh");
		System.out.println(u);
		System.out.println(u.toString());
		
		System.out.println("=================");

		String s = new String("ram");
		System.out.println(s);
	}

}
