package hw5Q3Constructor;

public class Student {

	public String stName;
	public int stID;
	public char Sex;
	public boolean isProgrammer;

	// default constructor (no argument constructor) declared
	public Student() {
		System.out.println("This is from deafult Constructor of Student class");
	}

	// Parameterized constructor declared
	public Student(String stName, int stId, char Sex, boolean isProgrammer) {
		this.stName = stName;
		this.stID = stId;
		this.Sex = Sex;
		this.isProgrammer = isProgrammer;
		System.out.println("The Student Name is: " + stName + ", Student Id: " + stId + ", Student Sex: " + Sex
				+ " and Java Programmer? Ans: " + isProgrammer);
	}

}
