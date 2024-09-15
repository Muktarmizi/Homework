package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	// default constructor.

	public Daughter() {
		System.out.println("----------------This is default constructor from daughter class-----------");
		super.FamilyName = "Muktar's Family";
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>3rd Floor Tenents Family :" + FamilyName);
	}

	// parameterized constructor.

	public Daughter(String birthMonth, int age) {
		super("Muktar Mizi", 35, 'M', true);
		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("\nDaughter Birth Month :" + birthMonth + ", Daughter Current Age :" + age);

	}

	// implemented method
	public void daughter() {
		System.out.println("------------This void type Method is from Daughter class---------------");
		super.father();
		super.FamilyName = "Didar's Family";
		System.out.println("\n >>>>>>>>>>>>>2nd Floor Tenents Family :" + FamilyName);
	}

	// parameterized method.

	public void daughterInfo(String birthMonth, int age) {
		super.fatherInfo("Didar Munshi", 39, 'M', false);

		System.out.println("\nDaughter Birth Month :" + birthMonth + ", Daughter Current Age :" + age);

	}

}
