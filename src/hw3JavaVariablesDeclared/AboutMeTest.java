package hw3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
	
		AboutMe mizi=new AboutMe(); //Class instantiated and constructor initialized.
		mizi.myName = "Mizi";
		mizi.myAge = 35;
		mizi.myCourseFee=2500;
		mizi.myIncome=90000;
		mizi.myFutureSavings=10000000000l;
		mizi.myHeight=5.11f;
		mizi.myGrade=3.50000;
		mizi.myGender='M';
		mizi.fullTimeStudent=true;
		mizi.aboutMe();
		
		AboutMe alex = new AboutMe();
		alex.myName = "Alex Cornfield";
		alex.myAge=25;
		alex.myCourseFee=3000;
		alex.myIncome=72000;
		alex.myFutureSavings=10000300000l;
		alex.myHeight=5.5f;
		alex.myGrade=4.50000000;
		alex.myGender='M';
		alex.fullTimeStudent=false;
		alex.aboutMe();
		// Test

	}

}
