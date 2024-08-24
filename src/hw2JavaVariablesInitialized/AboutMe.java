package hw2JavaVariablesInitialized;

public class AboutMe {
	// variable declared
	public String muktarMizi;

	// byte,int,float, short, long, and double type variables and boolean and char
	// initialized.

	public String myName = "Muktar Mizi";
	public byte myAge = 35;
	public short myCourseFee = 2500;
	public int myIncome = 90000;
	public long myFutureSavings = 10000000000l;
	public float myHeight = 5.11f;
	public double myGrade = 3.5555;
	public char myGender = 'M';
	public boolean fullTimeStudent = true;

   //Declare a Constructor 
	public AboutMe() {
		System.out.println("------------ This is all about Myself ------------:");
	}
  
	public void aboutMe() { //method implement 
    
    System.out.println("\nName:"+myName+"\nAge:"+myAge+"\nGender:"+myGender+"\nHeight:"+myHeight
    		+"\nStudent:"+fullTimeStudent+"\nGrade:"+myGrade+"\nIncome:"+myIncome
    		+"\nCourse Fee:"+myCourseFee+"\nSaving:"+myFutureSavings);
		
		
}
	public static void main(String[] args) {
		AboutMe mizi = new AboutMe(); // class instantiate.
		mizi.aboutMe();
		System.out.println(mizi.myName);
		System.out.println(mizi.myAge);
		System.out.println(mizi.myGender);
		System.out.println(mizi.myHeight);
		System.out.println(mizi.fullTimeStudent);
		System.out.println(mizi.myGrade);
		System.out.println(mizi.myIncome);
		System.out.println(mizi.myCourseFee);
		System.out.println(mizi.myFutureSavings);

// When an object [mizi] is created from a class [AboutMe], Constructor is initialized.

	}
}

