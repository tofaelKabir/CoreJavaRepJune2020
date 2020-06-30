package hw4Q2Abstraction02;

/*
 Q.2-iii) Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? 
 * */
public class ColumbiaUniversity {
	
	
	//public abstract void chemistry(); An abstract method can only be created under an abstract class
	
	public void biology() { //non abstract method is possible to create and can be implemented
		System.out.println("Biology is a dept of ColumbiaUniversity");
	}
	
	public ColumbiaUniversity() { //default constructor declared
		System.out.println("This default constructor from ColumbiaUniversity Class");
	}
	
	

}
