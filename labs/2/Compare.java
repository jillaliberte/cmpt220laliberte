
import java.util.Scanner;
public class Compare{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter two numbers (x y): ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		System.out.println (number1 + " > " + number2 + " "+ (number1 >number2));
		System.out.println (number1 + " >= " + number2 + " "+ (number1 >=number2));
		System.out.println (number1 + " == " + number2 + " "+ (number1 == number2));
		System.out.println (number1 + " != " + number2 + " "+ (number1 != number2));
		System.out.println (number1 + " < " + number2 + " "+ (number1 < number2));
		System.out.println (number1 + " <= " + number2 + " "+ (number1 <= number2));
		input.close ();	
	}

}