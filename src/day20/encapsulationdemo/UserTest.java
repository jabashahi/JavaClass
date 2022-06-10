package day20.encapsulationdemo;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User();
		//set
		user1.setUsername("santosh");
		user1.setPassword("pp");
		//get
		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword());
		System.out.println("================");
		User user2 = new User();
		//set
		user2.setUsername("raju");
		user2.setPassword("rrr");
		//get
		System.out.println(user2.getUsername());
		System.out.println(user2.getPassword());
	}

}
