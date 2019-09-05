import java.util.Scanner;

public class CalculateEnergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a value in kilograms");
		int mass = input.nextInt();
		System.out.print ("Special relativity: ");
		System.out.print (mass * (Math.pow(299972458, 2)));
		input.close ();
	}

}
