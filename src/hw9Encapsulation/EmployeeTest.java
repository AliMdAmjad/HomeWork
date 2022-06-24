package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Md Ali");
		employee.setAge(33);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Employee1 Name: " + employee.getName() + "\nEmployee1 Age: " + employee.getAge()
				+ "\nEmployee1 Sex: " + employee.getSex() + "\nUS Citizen: " + employee.isUsCitizen());
	}

}