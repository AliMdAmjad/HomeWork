package hw11Polymorphism;

/*
Method overloading -- most common name
Method overloading -- (same method name but different type of parameter/signature or different combination of parameter)
Method overloading has Different name: Early binding or static binding or compile time Polymorphism.
*/

public class Sister {

	public void sister() {
		System.out.println("This is from void type method from sister");
	}

	public void sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println(total1);
	}

	public int sister(int age1, int age2) {
		int total2 = age1 + age2;
		System.out.println(total2);
		return total2;
	}

	public int sister(int age1, int age2, String age4) {
		int total3 = age1 + age2 + Integer.parseInt(age4);
		System.out.println(total3);
		return total3;
	}

	public final int sister(int age1, int age2, int age3, int age5) {
		int total5 = age1 + age2 + age3 + age5;
		System.out.println(total5);
		return total5;
	}

	public static int sister(int age1, int age2, int age3, int age5, int age6) {
		int total6 = age1 + age2 + age3 + age5 + age6;
		System.out.println(total6);
		return total6;
	}

}
