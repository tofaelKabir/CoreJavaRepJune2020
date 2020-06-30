package homeWork2;

/*
Create a class "Employee01" inside package "hw2Q4VariableAndMethod". Assume you initialize 2 variable, EmpName = (your name), empId = (any id) which are non-static. Create a non-static void method "empInfo" and call those variables to print inside the method by System.out.println. Can you print your id and name? Why do you need to call every method or variable to print under the main method? Without creating an object, can you print non-static empInfo method in the console by System.out.println? If yes, paste your code here. If no, explain by Java comments in one line what change you have to bring print your name and id from main method. Paste your code below.
 * */
public class Employee01 {

	public static String EmpName = "Farruk";
	public static int empId = 1234;

	public static void empInfo() { //method implemented
		System.out.println("EmpName: "+EmpName +", empId: "+ empId);
	}

	public static void main(String[] args) {
		empInfo(); //method initialized

	}

}
