package day27.polymorphism;

public class AccessModifireDemochild extends AccessModifireDemo {

	public static void main(String[] args) {
		AccessModifireDemo ob = new AccessModifireDemo(4);
		ob.publicMethod();
		ob.protectedMethod();
		ob.defaultMehtod();
		//ob.privateMethod();
	}
}
