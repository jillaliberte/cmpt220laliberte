
import java.util.Scanner;

public class LargestElement {
	
	public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers into the array: ");
		double a [] = new double [10];
		for (int i = 0; i < a.length; i++ )
		a[i]= input.nextDouble();
		
		System.out.println (max(a));
		input.close();
}
	
	public static double max(double[] array) {
		double largest = array[0];		
		for (int i = 1; i < array.length; i++ ) {
			if (array[i]>largest) 
				largest = array[i];
		}
		return largest;
		
	}

}