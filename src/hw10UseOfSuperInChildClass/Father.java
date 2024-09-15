package hw10UseOfSuperInChildClass;

public class Father {

	// declare 5 variables: Name, age, sex, usCitizen , FamilyName.

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	// default constructor.

	public Father() {
		System.out.println("..............This Is Default Constructor from Father Class................");

	}

	// parameterized constructor

	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("\nFather Name : " + name + ", Father Age : " + age + ", Father Sex :" + sex
				+ ", Father USA Citizen :" + usCitizen);

	}

	// method implemented.
	public void father() {
		System.out.println("-------------This void type Method is from Father Class----------------------");
	}

	// parameterized method.
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {

		System.out.println("\nFather Name : " + name + ",Father Age : " + age + ",Father Sex :" + sex
				+ ",Father USA Citizen :" + usCitizen);

	}

}
