package collection;

public class CountVowel {

	public static void countvowel(String s) {

		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'c' || s.charAt(i) == 'b' || s.charAt(i) == 'k' || s.charAt(i) == 'n'
					|| s.charAt(i) == 'l') {

				count += 1;
			}
		}
		System.out.println("Number of Vowel" + count);

	}

	public static void main(String[] args) {
		// ( "AAAAAbbbbbbcccccc kkkkkkjjjjjjllllll nnnnnNNNNNNmmmmm
		// lllllLLLLLLLLOOOOPPPP ");

		countvowel("AAAAAbbbbbbcccccc   kkkkkkjjjjjjllllll nnnnnNNNNNNmmmmm  lllllLLLLLLLLOOOOPPPP   ");

		// Numbers of Vowel 48
	}

}
