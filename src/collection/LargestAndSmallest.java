package collection;

public class LargestAndSmallest {

	public static void largestandsmallest() {
		
		int [] number = {1, 9, 10, 15, 18, 20, 50, 80};
	    int largest=number[0];
	    int smallest=number[0];
	    for (int i =1;i<number.length;i++) {
	    	if (number[i]>largest) {
				largest=number[i];
	    	}else if (number[i]<smallest) {
	    		smallest=number[i];
	    		}
			}
			System.out.println("Largest Number :" + largest);
			System.out.println("Smallest Number :" + smallest);
		}
	public static void main (String[]args) {
		largestandsmallest(); // output : Largest= 80 and smallest = 1
	}
	
	}		
				
			
	