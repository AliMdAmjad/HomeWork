package hw8Inheritance;

//Here Mammal is a Child class, and Animal is a Parent class
//we use extends keyword to inherit the parent class
//Here Single inheritance because Animal extends to no class

public class Mammal extends Animal {
	public void mammalInfo() {
		System.out.println("This method is from Mammal Class");
	}

}