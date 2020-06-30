package hw4Q2Abstraction02;

/*
 Q.2-iv) v) Create a regular Class RockefellerUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- maths and statistics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance for a regular Class? Can a regular Class inherit other Abstract Class or regular class or interface? How many inheritances is possible by a regular Class? Use the above regular Classes to answer my questions. 
 * */
public class RockefellerUniversity {
	
//public abstract void math(); //An abstract method can not be created under a regular class
	
	public void statistics() { //non abstract method is possible to create and can be implemented
		System.out.println("Statistics is a dept of RockefellerUniversity");
	}
	
	public RockefellerUniversity() { //default constructor declared
		System.out.println("This default constructor from NRockefellerUniversity Class");
	}
	
	//for remaining answer please see the new class RockefellerUniversity1

}