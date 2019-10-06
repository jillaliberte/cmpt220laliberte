import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers into the array: ");
		double a [] = new double [10];
		for (int i = 0; i < a.length; i++ )
		a[i]= input.nextDouble();
		
		System.out.println (deviation(a));
		System.out.println (mean(a));
		input.close();
	}
		
	public static double deviation(double[] x) {
		double dev = 0;
		for (int i = 0; i < x.length; i++ ) {
			dev += Math.pow ((x[i]-mean(x)), 2);
		}
		return Math.sqrt(dev/10 - 1);
	}
	
	
	public static double mean(double[] x) {
		double sum = 0;		
		for (int i = 1; i < x.length; i++ ) {
			sum = sum + x[i];	
		}
		double average = sum/10;
		return average;
	}

}
