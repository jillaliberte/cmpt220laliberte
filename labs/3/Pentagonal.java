
public class Pentagonal {

	public static void main(String[] args) {
		for (int i = 1; i<=50;i++) {
			if (i % 10 == 0) {
				System.out.println (pent(i));
			}
			System.out.print(pent(i) +  " ");
			}
		}
	
	public static int pent (int i) {
		return (3* (i*i) - i)/2;
	}
}
