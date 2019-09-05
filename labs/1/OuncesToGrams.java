import java.util.Scanner;

public class OuncesToGrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a value in ounces");
		int num1 = input.nextInt();
		System.out.print (num1);
		System.out.print (" ounces is ");
		System.out.print (num1 * 28.3495);
		System.out.println (" grams");
		input.close ();
	}

}
