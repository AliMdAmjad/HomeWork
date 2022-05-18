package hw3JavaVariables;

public class AboutMe {
	// variables declared and initialized
	public String name = "Md Ali";
	public byte age = 35;
	public short myApartmentRent = 1600;
	public int myYearlySalary = 65000;
	public long myBankBalance = 25500;
	public float myHeight = 5.8f;
	public double myGrade = 4.69876;
	public char sex = 'M';
	public boolean usCitizen = true;

	// constructor declared
	public AboutMe() {
		System.out.println("\nThis is all about us ----\n");
	}

	// method implemented
	// here public is access modifier, void is type of method
	// aboutMe name of the method
	public void aboutMe() {
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy HouseRent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);

	}

}
