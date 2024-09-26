package hw16IfElseCondition;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		System.out.println("Today's Weather");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter today's temperature: ");
		int todaysTemperature = scanner.nextInt();

		if (todaysTemperature < 32) {
			System.out.println("Freezing");
		} else if (todaysTemperature < 55) {
			System.out.println("Pleasant");
		} else if (todaysTemperature < 73) {
			System.out.println("Getting Warmer");
		} else if (todaysTemperature < 101) { // today's weather is 75.
			System.out.println("Hot");
		} else if (todaysTemperature >= 101) {
			System.out.println("Very Hot");
		} else {
			System.out.println("Please put a valid temperature");
		}
		scanner.close();
	}
}
