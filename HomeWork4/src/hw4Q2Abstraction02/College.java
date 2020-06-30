package hw4Q2Abstraction02;
/*
 02) Copy your previous package "hw3Q2Abstraction01" and rename it to "hw4Q2Abstraction02" inside your HW project and execute the remaining. Read the question very carefully. i) Can you create a Constructor inside the interface? If yes, create default Constructor on each interface. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance for Interface? Can an interface inherit other Interface, or a regular class or abstract class? How many inheritance is possible? Use all the interfaces -- University, Hospital and College to answer my questions. 
 * */
public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
}
    public College () { Default constructor not possible
	//System.out.println("This is default constructor from interface class College?");
	
	/*
	 i) An interface cannot have a constructor. As interface does not need an object so there's no need of having a constructor.
	 The keyword 'extends' is used for inheritance in interface.
	 An interface can inherit other interface but not a regular class/abstract.
	 An interface can inherit more than one interface.  
	 (See Interface-TestCollege for the remaining answer of this question i)
	 **/

