package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		System.out.println("Constructor Daughter");
	}

	public Daughter(String birthMonth, int age) {
		super();// default constructor of Father(parent[super] class)
		this.birthMonth = birthMonth;
		this.age = age;
		// Either default or parameterized (1)constructor can be called by super method
		// from the super class
		// super keyword can call methods+(parameter)+variables and initialize all
		super.father();
		super.fatherInfo("Mortuz", 63, 'M', false);
		super.familyName = "Ali";
		System.out.println("C Parameter Daughter " + birthMonth + " " + age);
	}

	public void daughter() {
		System.out.println("daughter method");
	}

	public void daughterInfo(String birthMonth, int age) {
		System.out.println("daughterInfo method " + birthMonth + " " + age);
	}

}
