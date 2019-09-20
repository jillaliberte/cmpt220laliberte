
public class ASCII {

	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 100; i++){
			if (i%20==0) {
				System.out.println ((char)i);
			}
			System.out.print((char)i +  " ");
		}
	}
}
