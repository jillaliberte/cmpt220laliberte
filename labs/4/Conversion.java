

public class Conversion {

	public static void main(String[] args) {
		int i = 0;
		double inch1 = 1;
		double inch2 = 0.39;
		double cent1 = 2.54;
		double cent2 = 1;
		

		System.out.println("in           cm  | cm           in");
		System.out.println("-----------------------------------");
		for (i = 0; i < 50; i++) {
			System.out.println(inch1 + "         " + cent1 + " | " + cent2 + "         "  + inch2);
			inch1++;
			cent1 = 2.54 * inch1;
			cent2 += 5;
			inch2 = 0.39 * cent2;
			cent1 = Math.round(cent1 * 100.0) / 100.0;
			inch2 = Math.round(inch2 * 100.0) / 100.0;
		} 
	} 
} 


