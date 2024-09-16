package hw13Polymorphism;

/* When different methods exist with the same method name but with 
 different parameters,it is called method overloading.for method overloading, 
 method can be void type or return type Parameterized or non parameterized type
 static or non static, final or not final count number of parameter, if parameter number is same, 
then see the sequence of data type in parameter If the sequence is different, then it is allowed. */

public class Sister {

	public void sister() {
		System.out.println(
				"\n Below We Will Mention All Sister's Age Of This Four Familys---( Mizi---Munshi----Tapader---Mr.Carter )");
	}

	public void sister(int age1, int age2, int age3) {
		int total = age1 + age2 + age3;
		System.out.println("\n Mizi Family Sister's  Age :" + total);

	}

	int sister(int age1, int age2, int age3, int age4) {
		int total1 = age1 + age2 + age3 + age4;
		System.out.println("\n Munshi Family Sister's Age :" + total1);
		return total1;
	}

	public static void sister(int age1, int age2, int age3, String age4, int age5) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("\n Tapader family Sister's Age :" + total2);

	}

	public final void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("\n Mr. Carter Family Sister's Age :" + total3);

	}

}
