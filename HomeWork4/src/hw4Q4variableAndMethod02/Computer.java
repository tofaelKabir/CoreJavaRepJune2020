package hw4Q4variableAndMethod02;

/*
 Q4) Create a package name "hw4Q4variableAndMethod02" in HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class -- computerConfiguration and use only one System.out.println(). Use the variables inside sysout.  
 * */

public class Computer {
	
	public String Brand;
	public String OperatingSystem;
	public String Model;
	public int price;
	public boolean MadeInUSA;
	public char grade; 
	
	public void computerconfigurationInfo() {
		System.out.println("Brand Name: " + Brand + ", Operating System: " + OperatingSystem + ", Model Name: " + Model + " Price: " + price + ", Is it made in USA? " + MadeInUSA + ", Grade: " + grade);
		
	}
	
	
	

	

	}


