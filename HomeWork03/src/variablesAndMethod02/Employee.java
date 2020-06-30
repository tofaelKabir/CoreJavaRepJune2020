package variablesAndMethod02;

public class Employee {
	public String Name;
	public int age;
	public char sex;
	public boolean usaCitizen;

	public void employeeInfo() {
		System.out.println(Name + "\n" + age + sex);
		System.out.println("Is USA citizen? Ans: " + usaCitizen);
	}
}
