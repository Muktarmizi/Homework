package hw13Polymorphism;

/*When different methods exist with the same method name with same parameters but 
   with different syntax or logic, it is called method overriding. 
  
  *static is a local member method of a class So, static method can't be override, if we remove 
    @override it will work as it is considered as the static method.
  
  * final method also Cannot @override from sister class,Final keyword doesn't allow any changes 
     in the method, variable, class.no change is also ok if we want same as parent class method.
*/

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("\n Below We Will Mention All Niece's  Age Of This Two Familys ---( Mizi---Munshi---)");
	}

	@Override
	public void sister(int age1, int age2, int age3) {
		int total = age1 + age2 + age3 + 6;
		System.out.println("\n Mizi Family Niece's  Age :" + total);

	}

	@Override
	int sister(int age1, int age2, int age3, int age4) {
		int total1 = age1 + age2 + age3 + age4 + 8;
		System.out.println("\n Munshi Family Niece's  Age :" + total1);
		return total1;
	}

}
