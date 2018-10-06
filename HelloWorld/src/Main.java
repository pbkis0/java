import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub System.out.println(args[0]); // Különboző
		/*
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
		 * 
		 * // Feladat Java2.pdf -ben 28.dia 1.feladat int a = Integer.parseInt(args[0]);
		 * // Integer.parseInt -metódussal konvertálhatód integer típusú számmá int b =
		 * Integer.parseInt(args[1]); int c = Integer.parseInt(args[2]); int V = a * b *
		 * c; // V - térfogat int A = 2 * (a * b + a * c + b * c); // A - felszín
		 * 
		 * System.out.println(a + " " + b + " " + c);
		 * System.out.println("A téglatest térfogata: " + V + " cm.");
		 * System.out.println("A téglatest felszíne: " + A + " cm.");
		 */

		/*
		 * // Feladat Java2.pdf -ben 29.dia 2.feladat //Írj programot, amely a
		 * paraméterként adot 2 számnak kiírja az összegét, különbségét, szorzatát és
		 * hányadosát. int a = Integer.parseInt(args[0]); int b =
		 * Integer.parseInt(args[1]);
		 * 
		 * int osszeg = a + b; int kulonbseg = a -b; int szorzat = a * b; double
		 * hanyados = (double) a / b;//
		 * 
		 * System.out.println("A két szám összege: " + osszeg);
		 * System.out.println("A két szám különbsége: " + kulonbseg);
		 * System.out.println("A két szám szorzata: " + szorzat);
		 * System.out.println("A két szám hányadosa: " + hanyados);
		 */

		// Feladat Java2.pdf -ben 30.dia
		// Írj programot, amely a paraméterként adott 5 számnak kiírja a számtani
		// közepét. 
	/*	int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);

		int szamtanikozep = (a + b + c + d + e) / args.length;  //A tömb hozzát az "args.length" -el tudjuk lekérdezni
		System.out.println("Az 5 szám számtani közepe: " + szamtanikozep);
		 */
		
		//Írj másodfokú egyenletet megoldó programot! Paraméterként megkapjuk az
		//a, b és c együtthatók értékét (egész számok), és írjuk ki az egyenlet két megoldását!
		
		//Segítség: Gyökvonáshoz a Math.sqrt() metódust használd! A
		//diszkrimináns gyökét double típusú változóban tárold!
		
		//Tesztadatok: Ha a programot az (1 -2 -15) paraméterekkel futtatod, az
		//egyenlet két megoldása: 5 és -3 lesz. (1 -4 4) paraméterek esetén a két
		// megoldás ugyanaz lesz: 2.
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double x1 = (-b-Math.sqrt((b*b) - 4 * a *c) ) / 2*a;
		double x2 = (-b+Math.sqrt((b*b) - 4 * a *c) ) / 2*a;
		
		System.out.println("Az x1 gyöke: " + x1);
		System.out.println("Az x2 gyöke: " + x2);
		
		

	}

}
