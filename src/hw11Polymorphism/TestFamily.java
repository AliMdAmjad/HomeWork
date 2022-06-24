package hw11Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n<---------Sister--------->\n");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(15, 25, 20);
		sister.sister(15, 25);
		sister.sister(22, 18, "24");
		sister.sister(20, 25, 19, 20);
		Sister.sister(10, 15, 16, 20, 33);

		System.out.println("\n<--Niece-->\n");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(10, 15, 16);
		niece.sister(10, 15);
		niece.sister(12, 15, "18");

	}

}