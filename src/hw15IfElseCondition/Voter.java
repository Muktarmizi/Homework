package hw15IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		int age1 = 19;

		if (age1 == 18) {
			System.out.println("I am a Voter");
		} else if (age1 < 18) {
			System.out.println("I am not a Voter");
		} else if (age1 > 18) {
			System.out.println("I am a Voter from age 18");
		} else {
			System.out.println("Please add a valid age");

		}

	}

}
