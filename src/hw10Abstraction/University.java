package hw10Abstraction;

public interface University extends College, Hospital {

	/*
	 * One keywords are used for the inheritance in Interface, answer is
	 * "Extends"Key word. Above University extends College, Hospital. "yes"
	 * interface inherit other Interfaces. But interface can not inherit regular
	 * class or abstract class by extends keyword? Multiple inheritances are
	 * possible in interface. but only can call other interfaces class only.
	 */

	// classSize, playGround, and teacher

	public String teacher();

	public int classize();

	public byte playGround();

	// public University() { error :
	// Can not create a Constructor inside the University interface.
	// Interface doesn't have method body like methods present in classes
	// and here method is declared inside Interface body,

	// JAVA implemented static and default type method in interface .
	// which are implemented in nature [non abstract] Example: gymnasium and
	// library.

	public static void gymnasium() {
		System.out.println("New Castle Fieldhouse Is The Lasrgest Gymnasium In The World.");
	}

	public default void library() {
		System.out.println("The Library Of Congress Is One Of The Largest Library In The World.");

	}

}
