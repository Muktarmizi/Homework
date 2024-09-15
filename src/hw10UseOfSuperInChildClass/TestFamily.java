package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n-----//------default construtor initialize from Father class-------//-------");
		Father father = new Father();

		System.out.println("\n-----//------parametrized construtor initialize from Father class-------//-------");

		Father father2 = new Father("Muktar Mizi", 35, 'M', true);

		System.out.println("\n-----//------void type method initialize from Father class-------//-------");

		father.father();

		System.out.println("\n-----//------parameterized method initialize from Father class-------//-------");
		father.fatherInfo("Didar Munshi", 39, 'M', false);

		System.out.println("*********************************************************************************");

		System.out.println("\n-----//------default construtor initialize from Daughter  class-------//-------");
		Daughter daughter = new Daughter();

		System.out.println("\n-----//------parametrized construtor initialize from Daughter  class-------//-------");
		Daughter daughter2 = new Daughter("September", 2);

		System.out.println("\n-----//------void type method initialize from Daughter class-------//-------");
		daughter.daughter();

		System.out.println("\n-----//------parameterized method initialize from Daughter class-------//-------");
		daughter.daughterInfo("Augest", 9);

	}

}
