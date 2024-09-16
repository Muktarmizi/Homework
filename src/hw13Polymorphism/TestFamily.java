package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
System.out.println("----------S----I----S----T------E-------R----<<<<<>>>>>>------A--------G-------E-----------");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(28, 30, 27);
		sister.sister(22, 30, 35, 29);
		sister.sister(3, 5, 6, "9", 12);
		sister.sister(2, 4, 7, "11", 13, 17);

		System.out.println(" \n \n");

System.out.println("---------N-------I-------E --------C---------E---<<<<<<>>>>>>----------A------G-------E-------");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(2, 3, 7);
		niece.sister(2, 3, 5, 9);

	}

}
