package hw9Abstraction;

public interface Hospital {

//emergencyRoom, surgeryRoom, cafeteria.

	public String emergencyRoom();

	public abstract void surgeryRoom();

	public void cafeteria(String name);

//morgue and pharmacy

	public static void morgue() {
		System.out.println("Hospital Morgue hours 8am - 9am (M-F)");

	}

	public default void pharmacy() {
		System.out.println("Hospital Pharmacy Open 24/7");
	}

}
