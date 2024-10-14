package coddingChallenge1;

/*
Que: Print out your name vertically but only the odd index 
Input: Tofael Kabir
Output:
o
a
l
K
b
r
*/

public class A02_odd_character_vertically {

	public static void inVartical(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {

				System.out.println(s.charAt(i));

			}

		}
	}

	public static void main(String[] args) {

		inVartical("Tofael Kabir");
	}
}
