package hw3JavaVariablesDeclared;

public class AboutMe {
	// variable declared
	public String muktarMizi;

	// byte,int,float, short, long, and double type variables and boolean and char
	// initialized.

	public String myName;
	public byte myAge;
	public short myCourseFee;
	public int myIncome;
	public long myFutureSavings;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean fullTimeStudent;

   //Declare a Constructor 
	public AboutMe() {
		System.out.println("------------ This is all about Myself ------------:");
	}
  
	public void aboutMe() { // method implemented.
    
    System.out.println("\nName:"+myName+"\nAge:"+myAge+"\nGender:"+myGender+"\nHeight:"+myHeight
    		+"\nStudent:"+fullTimeStudent+"\nGrade:"+myGrade+"\nIncome:"+myIncome
    		+"\nCourse Fee:"+myCourseFee+"\nSaving:"+myFutureSavings);
		
    
		
}
	

	
}

