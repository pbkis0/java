
public class Feladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double x1 = (-b-Math.sqrt((b*b) - 4 * a *c) ) / 2*a;
		double x2 = (-b+Math.sqrt((b*b) - 4 * a *c) ) / 2*a;
		
		System.out.println("Az x1 gyöke: " + x1);
		System.out.println("Az x2 gyöke: " + x2);
	}

}
