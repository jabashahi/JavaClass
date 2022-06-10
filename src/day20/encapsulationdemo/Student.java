package day20.encapsulationdemo;

public class Student {

	String stuName;
	int roll;
	
//valid
//	public Student(String s, int r) {
	//	this.stuName = s;
	//	this.roll = r;
	//}
	
	//xxx
	//public Student(String stuName, int roll) {
	//	stuName = stuName;
	//	roll = roll;
	//}
	
	//xxx
	//public Student(String stuName, int roll) {
	//	stuName = this.stuName;
	//	roll = this.roll;
	//}
	
	//valid
	public Student(String stuName, int roll) {
		this.stuName = stuName;
		this.roll = roll;
	}
	
	public void displayInfor() {
		System.out.println("Student name is: " + stuName);
		System.out.println("Roll is: " + roll);
	}

	public static void main(String[] args) {
		Student s1 = new Student("ram", 22);
		s1.displayInfor();
	}

}
