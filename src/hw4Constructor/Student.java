package hw4Constructor;

public class Student {

//Declare some variable --> name, id, gender, grade (as float), isProgrammer(as boolean).
	public String name;
	public int id;
	public char gender;
	public float grade;
	public boolean isProgrammer;
	// default constructor
	public Student () {
		System.out.println("This is all about Student");
		}

	
	public Student(String name, char gender, int id, float grade, boolean isProgrammer) {
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("NEW STUDENT NAME:  "+ name +", STUDENT GENDER:  "+ gender +", STUDENT ID:   "+ id  +",  STUDENT GRADE:  "+ grade  +", JAVA PROGRAMMER ? Ans:  "+ isProgrammer);
		}
	
	}
