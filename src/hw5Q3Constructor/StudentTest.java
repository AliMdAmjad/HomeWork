package hw5Q3Constructor;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(); // here default Constructor is initialized

		// Parameterized constructor initialized
		Student mdAli = new Student("Md Ali", 27, 'M', true); // here Constructor is initialized
		Student mdRahat = new Student("Md Rahat", 12, 'M', true);
		Student nozhhatTasfia = new Student("Nozhat Tasfia", 33, 'F', true);
		Student hasinaMomotaz = new Student("Hasina Momotaz", 21, 'F', false);

	}

}
