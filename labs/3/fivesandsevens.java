
public class fivesandsevens {

	public static void main(String[] args) { 
		
		for (int i = 100; i <= 500; i++) {
			if (i % 5== 0 ^ i % 7 == 0)	 // JA: The exclusive OR takes care of all the cases
			if (i%10==0) {
				System.out.println ();
			}
			System.out.print(i +  " ");
		}
	}
}


