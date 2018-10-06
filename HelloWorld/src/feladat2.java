
public class feladat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj programot, mely a paraméterként adott számról eldönti, hogy osztható-e
2-vel, 3-mal és 5-tel! A program írja ki a képernyore mindhárom vizsgált
prímszámról, hogy az osztója vagy nem osztója a felhasználó által adott
számnak! */		
		int szam = Integer.parseInt(args[0]);
		
		if (szam % 2 == 0) {
			System.out.println("Igen / 2");
		}else {
			System.out.println("Nem osztahtó 2-vel.");
		}
		
		if (szam % 3 == 0) {
			System.out.println("Igen / 3");
		}else {
			System.out.println("Nem osztható 3-al.");
		}
		
		if (szam % 5 == 0) {
			System.out.println("Igen / 5");
		}else {
			System.out.println("Nem osztható 5-el.");
		}
		
			
		
		
	}

}
