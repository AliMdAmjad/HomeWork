package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe amjad = new AboutMe(); // Constructor is Initialized
		amjad.name = "Md Ali";// Variable Initialized
		amjad.age = 37;
		amjad.myApartmentRent = 32766;
		amjad.myYearlySalary = 65546;
		amjad.myBankBalance = 9223372036854775807l;
		amjad.myHeight = 5.77647f;
		amjad.myGrade = 4.645265372563;
		amjad.sex = 'M';
		amjad.usCitizen = true;
		amjad.aboutMe(); // method is initialized

		AboutMe alex = new AboutMe(); // Constructor is Initialized
		alex.name = "Alex";
		alex.age = 32;
		alex.myApartmentRent = 22660;
		alex.myYearlySalary = 1147486647;
		alex.myBankBalance = 9223372032314775807l;
		alex.myHeight = 5.47f;
		alex.myGrade = 4.7253;
		alex.sex = 'M';
		alex.usCitizen = false;
		alex.aboutMe(); // method is initialized

	}

}
