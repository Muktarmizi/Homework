package hw7Abstraction;

public abstract class MedicalSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Bio Chemistry Lab Will Open At 09:00am.");
	}

	public MedicalSchool() { // default Constructor.

	}
}
