package hw4Q5Constructor01;

/*
 Q5.  Create a package name "hw4Q5Constructor01" in HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor.  
 * */

public class Computer {
	
	public String Brand;
	public String OperatingSystem;
	public String Model;
	public int price;
	public boolean MadeInUSA;
	public char grade; 
	
	public Computer() { //default constructor declared
		System.out.println("This default constructor is from the Computer class");
	}
	
	public Computer(String Brand, String OperatingSystem, String Model, int price, boolean MadeInUSA, char grade) { //local variables in parameterized constructor
		this.Brand = Brand;
		this.OperatingSystem = OperatingSystem;
		this.Model = Model;
		this.price = price;
		this.MadeInUSA = MadeInUSA;
		this.grade = grade;
		System.out.println("Brand Name: " + Brand + ", Operating System: " + OperatingSystem + ", Model Name: " + Model + " Price: " + price + ", Is it made in USA? " + MadeInUSA + ", Grade: " + grade);
		
	}
	public Computer(String Brand) {
		this.Brand = Brand;
		System.out.println("Brand Name: " + Brand);
	}
	
	public Computer(String Brand, int price, boolean MadeInUSA) {
		this.Brand = Brand;
		this.price = price;
		this.MadeInUSA = MadeInUSA;
		System.out.println("Brand Name: " + Brand + " Price: " + price + " Is it made in USA? " + MadeInUSA);
	}
	
	public Computer(String Brand, String OperatingSystem, int price, boolean MadeInUSA, char grade) {
		this.Brand = Brand;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.MadeInUSA = MadeInUSA;
		this.grade = grade;
		System.out.println("Brand Name: " + Brand + " Operating System: " + OperatingSystem + " Price: " + price + " Is it made in USA? " + MadeInUSA + " Grade: " + grade);
	}
	
	public void computer() {
		System.out.println("This method from the Computer class");
	}
}
