package day13.objectdemo;

public class ObjectDemo2 {

	public static void main(String[] args) {

		System.out.println(new ObjectDemo2());

		// reference variable
		ObjectDemo2 ob1 = new ObjectDemo2();
		System.out.println(ob1);

		ObjectDemo2 ob2; // reference variable
		ob2 = new ObjectDemo2();// object
		System.out.println(ob2);
		System.out.println(ob2.hashCode());
		System.out.println("day13.objectdemo.ObjectDemo2@3f8f9dd6" + Integer.toHexString(ob2.hashCode()));
	}

}
