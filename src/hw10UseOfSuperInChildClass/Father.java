package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("Constructor Father");

	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("C Parameter Father");
	}

	public void father() {
		System.out.println("method father");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println(
				"Father Name: " + name + " Father Age: " + age + " Sex: " + sex + " US Citizen?: " + usCitizen);

	}

}
