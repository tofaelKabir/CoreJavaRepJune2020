package hw4Q2Abstraction02;

/*
02) i) (remaining) Can an interface inherit other Interface, or a regular class or abstract class? How many inheritance is possible? Use all the interfaces -- University, Hospital and College to answer my questions. 
* */

public interface TestCollege extends Hospital{
	public void commonRoom();//
}


public interface TestCollege extends MedicalSchool{ //an interface can't inherit an abstract
	public void laboratory();
}

	

public interface TestCollege extends Hospital, University {//the error probably shows because we already called the TestCollege interface above. we can inherit other interface or do this in by opening another fresh interface TestCollege-1
	public void commonRoom();
	public void laboratory();
	public void languageClub();

}

/*
 * i)  An interface can inherit other interface but not a regular class/abstract. An interface can inherit more than one interface.
 **/
