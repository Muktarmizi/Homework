package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool { //Explain in Line 5-11,

	// 2 keywords used to inheritance in this class. Extends and implements.
	// "implements" keyword is used to inherit Interface in regular class.
	// a regular class can inherit more than one Interface.
	// a regular class can not inherit a regular class or abstract class by
	// implements keyword.
	// extends keyword used before implements keyword if regular class, abstract
	// class, interface need to be inherited.

	// A regular class can inherit only (one regular class or one abstract class) by
	// using extends keyword.
	// A regular class can't inherit an Interface by extends keyword.
    // "public abstract void chemistry();Error."
	// Contains only non abstract methods, doesn't contain abstract methods.

	public void biology() {
		System.out.println("Biology At Columbia University");
	}

	public ColumbiaUniversity() { // default Constructor.

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public String laboratory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void languageClub(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String emergencyRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public String teacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int classize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte playGround() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygien() {
		// TODO Auto-generated method stub

	}

}
