
public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 1,feladat
	 * Írj programot, amely a paraméterben adott számról eldönti és kiírja annak
	paritását (páros vagy páratlan)!*/
		// https://www.webotlet.hu/?p=259
		int szam = Integer.parseInt(args[0]);
		
		if (szam % 2 == 0  ) {
			System.out.println("Páros szám.");
		}else {
			System.out.println("Páratlan szám.");
		}
		
		
	}

}
