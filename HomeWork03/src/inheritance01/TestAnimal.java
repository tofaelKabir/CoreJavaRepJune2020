package inheritance01;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		
				
		
		
		
		

	}

}
