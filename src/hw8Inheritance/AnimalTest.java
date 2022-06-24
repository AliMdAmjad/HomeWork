package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		// Only Animal and no inheritance--Animal is Parent(Super Class) to Mammal,
		// Reptile and Birds which is Hierarchical inheritance

		System.out.println("\n---------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Mammal--Animal ---> single inheritance

		System.out.println("\n---------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();// Dog--Mammal--Animal

		System.out.println("\n---------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();// BullDog--Dog--Mammal--Animal---> multi-level inheritance

		System.out.println("\n---------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();// Reptile--Animal, Reptile is a child class and Animal is Parent class

		System.out.println("\n---------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();// Snake--Reptile--Animal.

		System.out.println("\n---------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();// Cobra--Snake--Reptile--Animal.

		System.out.println("\n---------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo(); // Birds--Animal

		System.out.println("\n---------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();// Robin--Birds--Animal

	}

}