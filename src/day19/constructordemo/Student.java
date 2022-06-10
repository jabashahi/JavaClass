package day19.constructordemo;

public class Student {

	// constructor overloading
	String studentName;
	int roll;

	public Student() {
		System.out.println("1. default constructor");
	}

	public Student(String sname) {
		studentName = sname;
		System.out.println("2. parameterized constructor sname");
	}

	public Student(int r) {
		roll = r;
		System.out.println("3. parameterized constructor r");

	}

	public Student(String sname, int r) {
		studentName = sname;
		roll = r;
		System.out.println("4. parameterized constructor sname r");

	}

	public Student(int r, String sname) {
		roll = r;
		studentName = sname;
		System.out.println("5. parameterized constructor r sname");

	}

	public void displayInfo() {
		System.out.println("Student name is: " + studentName);
		System.out.println("Roll is: " + roll);
	}

	public static void main(String[] args) {

		Student student1 = new Student("ram");
		System.out.println("================");
		student1.displayInfo();
		Student student2 = new Student();
		System.out.println("================");
		student2.displayInfo();
		Student student3 = new Student("raju, 22");
		System.out.println("================");
		student3.displayInfo();
	}

}
