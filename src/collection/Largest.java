package collection;

import java.util.Iterator;

public class Largest {

	public static void largest() {
		int[] number = { 1, 9, 10, 15, 18, 20, 50, 80 };
		int largest = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
		}
		System.out.println(largest);

	}

	public static void main(String[] args) {

		largest(); // largest = 80
	}
}
