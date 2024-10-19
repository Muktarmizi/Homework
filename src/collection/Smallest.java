package collection;

import java.util.Iterator;

public class Smallest {

	 public static void smallest() {
		 int[]number = {1, 9, 10, 15, 18, 20, 50, 80};
		 
		 int smallest = number[0];
		 
		for (int i= 1; i< number.length;i++) {
			if (number[i]<smallest) {
			smallest=number[i];
			}
		}
		 
		 System.out.println(smallest);
		 }
	 
	 public static void main (String[]args) {
		 smallest(); //smallest = 1
	 }
}
		 
	
	
	
	
	
	
	

