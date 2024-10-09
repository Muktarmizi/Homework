package hw8UseOfLoop;

public class OddNumber {

	public static void main(String[] args) {

		int s = -20;
		int e = 50;

		for (int i = s; i <= e; i++) {

			if (i % 2 == 1) {

				System.out.println("Odd Number :" + i);

			}

		}
	}

}
