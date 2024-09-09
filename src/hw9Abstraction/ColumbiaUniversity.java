package hw9Abstraction;

public class ColumbiaUniversity extends RockefellerUniversity {

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

}
