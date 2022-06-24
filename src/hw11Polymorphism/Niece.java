package hw11Polymorphism;

/*
summary: same method name, same signature/parameter but Overriding the logic of the method
Method overriding (same method name, same parameter but different syntax or logic)
Also called -- Late binding or dynamic binding or runtime Polymorphism
*/

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("This is from void type method from sister");
	}

	@Override
	public void sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3 + 1;
		System.out.println(total1);
	}

	@Override
	public int sister(int age1, int age2) {
		int total2 = age1 + age2 * 2;
		System.out.println(total2);
		return total2;
	}

	@Override
	public int sister(int age1, int age2, String age4) {
		int total3 = age1 / 3 + age2 + Integer.parseInt(age4);
		System.out.println(total3);
		return total3;
	}

	/*
	 * 1)Final type method cannot be Overriden 
	 * 2)Static method can't be overriden,if we remove @override it will work as 
	 * -static method of this Niece class
	 * -because static method is a local method of a class
	 */

	/*
	 * @Override public final int sister(int age1, int age2, int age3, int age5) {
	 * int total5 = age1 + age2 + age3 + age5; System.out.println(total5); return
	 * total5; }
	 * 
	 * @Override public static int sister(int age1, int age2, int age3, int age5,
	 * int age6) { int total6 = age1 + age2 + age3 + age5 + age6;
	 * System.out.println(total6); return total6; }
	 */

}
