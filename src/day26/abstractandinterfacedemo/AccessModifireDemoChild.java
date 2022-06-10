package day26.abstractandinterfacedemo;

import day27.polymorphism.AccessModifireDemo;

public class AccessModifireDemoChild extends AccessModifireDemo {

	public static void main(String[] args) {
		AccessModifireDemo ob = new AccessModifireDemo();
		ob.publicMethod();
		// ob.protectedMethod();
		// ob.defaultMehtod();
		// ob.privateMethod();

		AccessModifireDemoChild obj = new AccessModifireDemoChild();
		obj.protectedMethod();
	}

}