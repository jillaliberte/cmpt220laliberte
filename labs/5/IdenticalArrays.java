import java.util.Scanner;
import java.util.Arrays;

public class IdenticalArrays {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.println("How many inputs in the first array? ");
		int first [] = new int [input.nextInt()];
		
		System.out.println ("Enter the inputs:  ");
		for (int i = 0; i < first.length; i++) {
			first[i]=input.nextInt();

		
		System.out.println("How many inputs in the second array? ");
		int second [] = new int [input.nextInt()];
		
		System.out.println ("Enter the inputs:  ");
		for (int j = 0; j < second.length; j++) {
			second[j]=input.nextInt();
			
		if (equal(first,second))
			System.out.println("Arrays are equal");
		else 
			System.out.println("Arrays are not equal");
			
			}
		}
		
		input.close();
	}
		public static boolean equal(int[] x, int[] y) {
			if (x.length != y.length) {
				return false;
			}
			Arrays.sort(x);
			Arrays.sort(y);
			
			for (int i = 0; i < x.length; i++) {
				if (x[i] != y[i])
					return false; 
			
		}	
			return true;
	}
}

