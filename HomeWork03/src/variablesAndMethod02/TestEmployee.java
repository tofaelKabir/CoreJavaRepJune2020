package variablesAndMethod02;


public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.Name = "TOFAEL";
		employee.age = 44;
		employee.usaCitizen = false;
		employee.employeeInfo();

		Employee employee1 = new Employee();
		employee1.Name = "Farruk";
		employee1.age = 41;
		employee1.usaCitizen = false;
		employee1.employeeInfo();
	
	}

}
