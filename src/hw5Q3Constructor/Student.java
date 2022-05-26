package hw5Q3Constructor;

public class Student {

	public String stName;
	public int stID;
	public char Sex;
	public float grade;
	public boolean isProgrammer;

	// default constructor (no argument constructor) declared
	public Student() {
		System.out.println("This is from deafult Constructor of Student class");
	}

	// Parameterized constructor declared
	public Student(String stName, int stId, char Sex, float grade, boolean isProgrammer) {
		this.stName = stName;
		this.stID = stId;
		this.Sex = Sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("The Student Name is: " + stName + ", Student Id: " + stId + ", Student Sex: " + Sex + " Grade is :" + grade 
				+ " and Java Programmer? Ans: " + isProgrammer);
	}

}
