package hw15IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		int age1 = 19;
		int voterAge = 18;

		if (age1 == voterAge) {
			System.out.println(age1 + " is equal to " + voterAge);
			System.out.println("I am a Voter");
		}
		else if (age1 < voterAge) {
			System.out.println(age1 + " is smaller than " + voterAge);
			System.out.println("I am not a Voter");
		} 
		else if (age1 > voterAge) {
			System.out.println(age1 + " is greater than " + voterAge);
			System.out.println("I am a Voter from age 18");
		} 
		else {
			System.out.println("Please add a valid age");

		}

	}

}
