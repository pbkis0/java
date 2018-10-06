import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub System.out.println(args[0]); // Különboző
		 * paramétereket leht megadni az agrumentumoknak a futtatás elején. pl // linux
		 * parancsok. System.out.println(args[0] + " " + args[1]); // Két argumentumot
		 * lehet összefüzni, és közé szóközt helyezünk el.
		 * 
		 * // Változó deklaráció int i = 10; double j = 2.5; char a = 'a'; char A = 65;
		 * String szoveg = "valami"; boolean igaze = true;
		 * 
		 * final double PI = 3.14; System.out.print(PI);
		 * 
		 * String szo = igaze ? "igaz" : "hamis";
		 * 
		 * if(igaze) { System.out.println(); } System.out.print(!igaze);
		 * 
		 * //System.out.println(i + " " + j + " " + a + " " + A + " " + szoveg + " " +
		 * igaze);// CTRL + SHIFT + F -a kodót megformázza az ECLIPS
		 * 
		 * 
		 
		// Feladat Java2.pdf -ben 28.dia 1.feladat
		int a = Integer.parseInt(args[0]); // Integer.parseInt -metódussal konvertálhatód integer típusú számmá
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int V = a * b * c; // V - térfogat
		int A = 2 * (a * b + a * c + b * c); // A - felszín

		System.out.println(a + " " + b + " " + c);
		System.out.println("A téglatest térfogata: " + V + " cm.");
		System.out.println("A téglatest felszíne: " + A + " cm.");
		*/
		
		// Feladat Java2.pdf -ben 29.dia 2.feladat
		//Írj programot, amely a paraméterként adot 2 számnak kiírja az összegét, különbségét, szorzatát és hányadosát.
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int osszeg = a + b;
		int kulonbseg = a -b;
		int szorzat = a * b;
		int hanyados = a - b;
		
		System.out.println("A két szám összege: " + osszeg);
		System.out.println("A két szám különbsége: " + kulonbseg);
		System.out.println("A két szám szorzata: " + szorzat);
		System.out.println("A két szám hányadosa: " + hanyados);
	}

}
