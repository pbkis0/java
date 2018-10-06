
public class feladat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Írj programot, mely egy 1 és 1 000 000 közötti számról eldönti, hogy hány
jegyu! */
		char[] teszt = args[0].toCharArray();
		if(teszt[0] == '-') {
		System.out.println("Ennyi számjegyű: " + (teszt.length-1)); //Ha negatív (-) számot aduk meg, akkor vegyen el belőle egyet, és úgy fusson le a program.
		} else {
			System.out.println("Ennyi számjegyű: " + teszt.length); //Ha pozitiv számot adunk meg, úgy fusson le a program.
		}
		
		
		
		
	}

}
