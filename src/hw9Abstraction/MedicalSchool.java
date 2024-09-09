package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {

	// An abstract class can inherit only one abstract class or one regular class by
	// extends key word
	// An abstract class can't inherit an Interface by extends key word

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Bio Chemistry Lab Will Open At 09:00am.");
	}

	public MedicalSchool() { // default Constructor.

	}
}
