
public class feladat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj programot, amely a paraméterként adott két számról eldönti, hogy
melyik a nagyobb! Vizsgáld meg, hogy a felhasználó valóban két
paramétert adott-e meg; két érték esetén hajtsd végre az összehasonlítást,
ellenkezo esetben írj ki hibaüzenetet! */
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		
		if (a > b) {
			System.out.println("Az első szám nagyobb.");
		} else {
			System.out.println("A második szám a nagyobb.");
		}
		
	}

}
