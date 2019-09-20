
public class Prime {
	public static void main(String[] args) {
		int count = 0;
	
		for (int i = 1500; i > 2; i --) {
			for (int j = 2;j<i;j++) {
				if (i%j == 0) {
					count = 0;
					break;
				}
				else 
				{
					count = 1;
				}
			}
			if (count ==1) {
				System.out.println (i);
				break;
			}
		}
	}
}