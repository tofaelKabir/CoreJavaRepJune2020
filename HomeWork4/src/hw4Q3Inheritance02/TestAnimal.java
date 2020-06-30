package hw4Q3Inheritance02;

/*
Q3.(remaining) Now create a class "TestAnimal". Under the main method create an object from each class and call their own method by their own object. Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal. An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. Also, show by java comments who is Parent class and who is child class. Paste your inheritance github link below 
* */

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal(); //Animal is the parent class
		animal.animalInfo();
		
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		
			
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		
				
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.reptilesInfo();
		cobra.animalInfo();
		
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		
		Reptiles reptiles = new Reptiles();
		reptiles.reptilesInfo();
		reptiles.animalInfo();
		
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptilesInfo();
		snake.animalInfo();
		
	//animal is the parent class and rest are of child class category		
		

	}

}
