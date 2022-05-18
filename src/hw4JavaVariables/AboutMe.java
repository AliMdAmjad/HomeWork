package hw4JavaVariables;

public class AboutMe {
	// variable declared
	public String name;
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

//Constructor declared
	public AboutMe() {
		System.out.println("\nThis is all about us ---\n");
	}

	// method implemented
	// here public is access modifier, void is type of method,
	// aboutMe name of the method
	public void aboutMe() {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy HouseRent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

}
