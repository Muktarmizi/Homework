package coddingChallenge1;


/*
Que: Print out your name vertically but only even index
Input: Tofael Kabir
Output:
T
f
e

a
i
*/

public class A03_even_character_vertically {

	public static void inVertical(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 1) {
				System.out.println(s.charAt(i));

			}
		}

	}

	public static void main(String[] args) {

		inVertical("Tofael Kabir");
	}

}
