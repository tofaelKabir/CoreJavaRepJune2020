package hw4Q2Abstraction02;

/*
 Q.2-iv) iv) Create a regular Class NYUniversity, create 2 methods inside the class - one is abstract and another one is non-abstract name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 * */
public class NYUniversity {
	
//public abstract void anthropology(); //An abstract method can not be created under a regular class
	
	public void physics() { //non abstract method is possible to create and can be implemented
		System.out.println("Physics is a dept of NYUniversity");
	}
	
	public NYUniversity() { //default constructor declared
		System.out.println("This default constructor from NYUniversity Class");
	}


}
