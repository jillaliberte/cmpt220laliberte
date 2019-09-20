import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter three numbers (a b c): ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.println("The average is: " + average(a,b,c)+ "\n");
		input.close ();
	}
	public static double average (double a, double b, double c) {
		return (a + b + c)/3.;
	
	}
	
	

	}
		
