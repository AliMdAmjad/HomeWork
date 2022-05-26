package hw6IfElseCondition01;

public class Voter {
	/*
	 * Create a package name --> "hw6IfElseCondition01" inside your HW project.
	 * Create a Class, name "Voter". Type the main method. After the main method,
	 * define a int type variable name is age and initialize your age. Now write
	 * some condition. a) your age is equal to 18, outcome will be "I am a Voter" b)
	 * your age is less than 18, outcome will be "I am not a Voter" c) your age is
	 * greater than 18, outcome will be "I am a Voter" d) And finally the outcome
	 * will be "Please add a valid age". In the above 4 condition, use appropriate
	 * key word like if, else if, else to execute that you are a voter or not.
	 * Please organize the code (very important). don't give any white space. push
	 * the code to GitHub and add the link below.
	 */
	public static void main(String[] args) {
		int age = 18;

		if (age == 18) {
			System.out.println("I am a Voter");
		} else if (age < 18) {
			System.out.println("I am not a Voter");
		} else if (age > 18) {
			System.out.println("I am a Voter");
		} else {
			System.out.println(" Please add a valid age");
		}

	}

}
