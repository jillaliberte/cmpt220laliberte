
public class Prime {
	public static void main(String[] args) {
		int count = 0;
	
		for (int i = 1500; i > 2; i --) {

			if (isPrime(i)) {
				System.out.println (i);
				break;
			}
		}
	}
	
	private static boolean isPrime(int num) {
		for (int j = 2;j<num;j++) {
			if (num%j == 0) {
				return false; // JA: Not a prime
			}
		}	
		return true; // JA: If it hasn't return then it is a prime
	}
}