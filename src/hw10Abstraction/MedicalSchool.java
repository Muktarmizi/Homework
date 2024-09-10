package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool { // Explain in Line 5-7,
	
	// "implements" keyword is used to inherit Interface in abstract class.
	// an abstract class can inherit more than one Interface.
	// an abstract class can not inherit a regular class or abstract class by implements keyword.

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
