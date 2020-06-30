package hw4Q5Constructor01;

/*
 Q5. (remaining) Create another class TestComputer. Create object as many as you want under main method. Initialize constructors. I want the first outcome in console as --> This is from default Constructor of Computer class. Second outcome -- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable.
 * */
public class TestComputer {

	public static void main(String[] args) {
		Computer computer1 = new Computer(); //default constructor initialized
		Computer computer2 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, false, 'C');
		Computer computer3 = new Computer("HP", "Windows10", "HP Notebook", 500, true, 'B');
		Computer computer4 = new Computer("Dell");
		Computer computer5 = new Computer("Lenovo", 700, false);
		Computer computer6 = new Computer("Microsoft Surface", "Windows10 Home", 600, true, 'B');
		
		
		

	}

}
