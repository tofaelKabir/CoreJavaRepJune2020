package hw4Q2Abstraction02;
/*
 Q2-ii) (remaining)Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? 
 * */
public abstract class MedicalSchool {

	public abstract void anatomyLab();
	
	public void biochemistryLab() {
	}

	public MedicalSchool() { //default constructor declared
		System.out.println("This default constructor from MedicleSchool Abstract Class");
	}
	
}


