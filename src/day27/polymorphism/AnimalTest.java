package day27.polymorphism;

import java.util.Scanner;

//run time polymorphisim (dynamic binding)
//which can be achieved by overriding of methods
public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choose animal: ");
		String animalType = input.next();
		
		switch(animalType) {
		case "dog":
			animal = new Dog();
			break;
		case "Tiger":
			animal = new Tiger();
			break;
		default:
			System.out.println("Wrong selection...");
			break;
			
		}
		if(animal != null) {
			animal.makeSound();
		}
		input.close();
	}

}
