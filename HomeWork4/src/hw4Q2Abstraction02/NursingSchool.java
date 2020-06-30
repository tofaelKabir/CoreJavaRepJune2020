package hw4Q2Abstraction02;
/*
Q2:ii) You have 2 abstract class name --MedicalSchool, EngineeringSchool already. Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance of Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes (3) to answer my questions.
* */

public abstract class NursingSchool {
	
	
	public void caring() { //non abstract method implemented
		System.out.println("Caring is trained in NursingSchool");
	}
		
	public abstract void hygiene(); //Abstract method declared
	
	
	public NursingSchool() { //default constructor declared
		System.out.println("This default constructor from NursingSchool Abstract Class");
	} 
	
		
	//Please see the other Abstract Classes- MedicalSchool/1 and EngineeringSchool/1 for the remaining answers
	
	
}


