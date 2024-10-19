package collection;

public class Reverse {

	public static void reverse(String s) {
		String[] ws = s.split(" ");

		for (int i = ws.length - 1; i > 0; i--) {
			System.out.print(ws[i] + (" "));

		}

	}

	public static void main(String[] args) {

		reverse("Hello World I am Muktar Mizi");

	} // outcome: Mizi Muktar am I World 

}
