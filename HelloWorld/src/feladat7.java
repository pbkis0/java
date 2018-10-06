
public class feladat7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Fejleszd tovább az elozo órán készített másodfokú egyenletet megoldó
programot úgy, hogy ha a négyzetes tag együtthatója nulla, akkor írja ki,
hogy az egyenlet nem másodfokú; továbbá ha a diszkrimináns kisebb, mint
nulla, akkor írja ki, hogy az egyenletnek nincs megoldása! Ellenorizd azt is,
hogy a felhasználó megfelelo számú paramétert adott-e meg! Ha nem, írj ki
hibaüzenetet. */
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		if (a == 0)
			System.out.println("Az egyenlet nem másodfokú!");
			double x = (double) -c /b;
			System.out.println("x = " + x);
	} else {
		
	}

}
