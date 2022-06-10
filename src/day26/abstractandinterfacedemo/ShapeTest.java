package day26.abstractandinterfacedemo;

public class ShapeTest {

	public static void main(String[] args) {
		// we can not create an object of an abstract class.
		// but we can create reference variable of an abstract class.
		Shape shape;

		shape = new Rectangle();
		shape.draw();

		System.out.println("===============");

		shape = new Triangle();
		shape.draw();
	}

}
