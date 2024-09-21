package hw16IfElseCondition;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		System.out.println("Today's Weather");
		Scanner scanner = new Scanner(System.in);

		int todaysTemperature = scanner.nextInt();
		int tem1 = 32;
		int tem2 = 55;
		int tem3 = 73;
		int tem4 = 101;

		if (todaysTemperature < tem1) {
			System.out.println("\" is smaller than - 32\" ");
			System.out.println("Freezing");
		} 
		else if (todaysTemperature < tem2) {
			System.out.println("\" is smaller than - 55 \" ");
			System.out.println("Pleasant");
		} 
		else if (todaysTemperature < tem3) {
			System.out.println("\" is smaller than - 73 \" ");
			System.out.println("Getting Warmer");
		} 
		else if (todaysTemperature < tem4) { // today's weather is 75.
			System.out.println("\" is smaller than - 101\" ");
			System.out.println("Hot");
		} 
		else if (todaysTemperature > tem4 || todaysTemperature == tem4) {
			System.out.println("\" is greater than or equal to - 101\"");
			System.out.println("Very Hot");
		} 
		else {
			System.out.println("Please put a valid temperature");
		}
		scanner.close();

	}
}
