
public class feladat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Írj programot, mely a paraméterként adott háromszög oldalak hosszúsága
		 * alapján eldönti, hogy a háromszög szerkesztheto-e!
		 */
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("A háromszög szerkeszthető");
		} else {
			System.out.println("Nem szerkesztető");
		}

	}

}
