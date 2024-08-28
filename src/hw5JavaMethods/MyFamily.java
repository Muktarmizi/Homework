package hw5JavaMethods;

public class MyFamily {
// child1Age, child2Age, child3Age, child4Age
	public int child1Age=8;
	public int child2Age=6;
	public int child3Age=4;
	public int child4Age=2;
	
	public int myFamily() {
		int sum=child1Age+child2Age+child3Age+child4Age;
	System.out.println( "The sum of my childrens age is: " + sum);	
		return sum;
		
		}
	
	public static void main(String[] args) {
		
   MyFamily family=new MyFamily();
   family.myFamily();
   
   }

}
