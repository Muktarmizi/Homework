package coddingChallenge1;

/*
Que: Print your name Horizontally but in reverse
Input: Tofael Kabir

Output:
ribaK leafoT

*/

public class A05_characterOneByOneHorizontallyButReverse {

	public static void inHorizontallyReverse(String s) {

		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));

		}

	}

	public static void main(String[] args) {

		inHorizontallyReverse("Tofael Kabir");
	}

}
