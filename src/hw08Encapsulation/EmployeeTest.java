package hw08Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setName("Muktar Mizi");
		employee.setAge(35);
		employee.setSex('M');
		employee.setCitizen(true);

		System.out.println("EMPLOYEE NAME : " + employee.getName() + "\nAGE : " + employee.getAge() + "\nSEX : "
				+ employee.getSex() + "\nCITIZEN : " + employee.isCitizen());

	}

}
