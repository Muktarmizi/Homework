package hw14Abstraction;

public class TestInstitute {

	// ColumbiaUniversity, University, and MedicalSchool
	public static void main(String[] args) {
   System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
   
		ColumbiaUniversity cUniversity = new ColumbiaUniversity();
		cUniversity.biology();
		cUniversity.commonRoom();
		cUniversity.laboratory();
		cUniversity.languageClub("English Language Club");
		cUniversity.emergencyRoom();
		cUniversity.surgeryRoom();
		cUniversity.cafeteria("University Cafeteria");
		cUniversity.lawInfo();
		cUniversity.vocationalInfo();
		cUniversity.teacher();
		cUniversity.classize();
		cUniversity.playGround();
		cUniversity.anatomyLab();
		cUniversity.hygien();
		cUniversity.biochemistryLab();
		cUniversity.maths();
		cUniversity.aeronauticalInfo();
		cUniversity.mechanicalLab();
		cUniversity.library();
		cUniversity.pharmacy();

		
		System.out.println("\n**************************************************************");

		// University university = new University(); (it is interface thats why it wont initialized.)
		
		University university = new ColumbiaUniversity(); 

		university.teacher();
		university.classize();
		university.playGround();
		university.studyRoom();
		University.gymnasium();
		university.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub("Spenish Language Club");
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria("Cafeteria----- Open at 8:30am, M-F ");
		university.pharmacy();

		
		System.out.println("\n**************************************************************************");

		//MedicalSchool mSchool = new MedicalSchool(); (it is Abstract Class thats why it wont initialized.)
		
		MedicalSchool mSchool = new ColumbiaUniversity();
		mSchool.anatomyLab();
		mSchool.biochemistryLab();
		mSchool.hygien();
		mSchool.caring();
		mSchool.lawInfo();

	}

}
