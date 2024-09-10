package hw10Abstraction;

public interface College {

	// commonRoom, laboratory, languageClub.

	public abstract void commonRoom();

	public String laboratory();

	public void languageClub(String name);

//dorm and studyRoom

	public static void dorm() {
		System.err.println(" College Dorm Visting Time End At 5pm.");

	}

	public default void studyRoom() {
		System.err.println("College StudyRoom close at 10pm.");

	}

}
