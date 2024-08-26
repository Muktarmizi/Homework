package hw5JavaMethods;

public class FullName {

	public String fullName(String fname, String lname) {

		System.out.println("Family Member: " + fname + " " + lname);
		return null;

	}

	public static void main(String[] args) {
		FullName fn = new FullName();

		fn.fullName("Muktar", "Mizi");
		fn.fullName("Mariam", "Begum");
		fn.fullName("Rayhan", "Mizi");
		fn.fullName("Raida", "Mizi");

	}

}
