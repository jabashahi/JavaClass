package day26.abstractandinterfacedemo;

//we can not use final keyword on an abstract class
public /*final*/abstract class Shape {
	
	//we can not use final, private and static keyword on abstract method
	public abstract void draw();
	
	/*abstract*/ int a = 5;
	
	//concrete method
	public void paint() {
		System.out.println("shape is painted.");
	}
	/*abstract*/ public Shape() {
		System.out.println("shape's constructor.");
	}
}

