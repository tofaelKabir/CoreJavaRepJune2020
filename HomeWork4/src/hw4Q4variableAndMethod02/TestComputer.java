package hw4Q4variableAndMethod02;

/*
Q4) (remaining) Create another class TestComputer. Create object under main method. Initialize object and method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is expecting from the test class. Paste your individual github link below 
* */

public class TestComputer {

	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.Brand = "Apple";
		computer.OperatingSystem = "MacBook Air";
		computer.Model = "MacOS Mojave";
		computer.price = 800;
		computer.MadeInUSA = false;
		computer.grade = 'C';
		computer.computerconfigurationInfo();

		Computer1 computer1 = new Computer1();
		computer1.Brand = "HP";
		computer1.OperatingSystem = "Windows10 Home";
		computer1.Model = "HP NoteBook";
		computer1.price = 500;
		computer1.MadeInUSA = true;
		computer1.grade = 'B';
		computer1.computerconfigurationInfo();

	}

}
// madeInUSA, not MadeInUSA
//MACOS MOJAVE IS OPERATING SYSTEM
