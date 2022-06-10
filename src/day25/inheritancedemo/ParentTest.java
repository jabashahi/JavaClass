package day25.inheritancedemo;

public class ParentTest {

	public static void main(String[] args) {
		Parent p = new Parent();//
		System.out.println(p.name);//
		p.greet();//
		//
		System.out.println(p.getClass());//

		Child c = new Child();
		System.out.println(c.name);
		c.greet();

		System.out.println(c.getClass());//
		//
		GrandChild g = new GrandChild();//
		System.out.println(g.name);//
		g.greet();//
	}

}
