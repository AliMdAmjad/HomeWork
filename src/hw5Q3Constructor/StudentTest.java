package hw5Q3Constructor;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(); // here default Constructor is initialized

		// Parameterized constructor initialized
		Student mdAli = new Student("Md Ali", 27, 'M', 3.123f, true); // here Constructor is initialized
		Student mdRahat = new Student("Md Rahat", 12, 'M', 4.123f, true);
		Student nozhhatTasfia = new Student("Nozhat Tasfia", 33, 'F', 3.345f, true);
		Student hasinaMomotaz = new Student("Hasina Momotaz", 21, 'F', 4.123f, false);

	}

}
