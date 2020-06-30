package hw4Q2Abstraction02;
/*
 Q.2-ii) (remaining) Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not?  
 * */
public abstract class EngineeringSchool {

	public abstract void mechanicalyLab();
	
	public void computerLab() {
	}

	public EngineeringSchool() { //default constructor declared
		System.out.println("This default constructor from EngineeringSchool Abstract Class");
	}
}
