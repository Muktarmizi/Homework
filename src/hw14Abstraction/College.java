package hw14Abstraction;

public interface College {

	// commonRoom, laboratory, languageClub.

	public abstract void commonRoom();

	public String laboratory();

	public void languageClub(String name);

// Dorm and studyRoom.

	public static void dorm() {

		System.out.println(" College Dorm Visting Time End At 5pm.");

	}

	public default void studyRoom() {
		System.out.println("College StudyRoom Open at 09:30am.");

	}

}
