package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalinfo();

		System.out.println("\n");

		Mammal mammal = new Mammal();
		mammal.mammalinfo();

		System.out.println("\n");

		Birds birds = new Birds();
		birds.birdsinfo(); // child class.
		birds.animalinfo(); // Parent class.

		System.err.println("\n");

		Reptile reptile = new Reptile();
		reptile.reptileinfo();

		System.out.println("\n");
		Dog dog = new Dog();
		dog.doginfo();

		System.out.println("\n");
		Snake snake = new Snake();
		snake.Snakeinfo();

		System.out.println("\n");

		Robin robin = new Robin();
		robin.robininfo();

		System.out.println("\n");

		BullDog bullDog = new BullDog();
		bullDog.bulldoginfo();

		System.out.println("\n");

		Cobra cobra = new Cobra();
		cobra.Cobrainfo();
		cobra.animalinfo(); // An object is calling other methods because class extended.

		// Cobra extends Snake , Snake extends Reptile,Reptile extends Animal.
		// Example of Multilevel Inheritance.

		// Mammal extend Animal, Reptile extends Animal, Birds extends Animal.
		// This is Example of Hierarchical Inheritance.
		// show single inheritance in (--Birds Class--)please check on it. exp:birds
		// extends Animal.

	}

}
