
import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a list of positive integers, the sequence will end when a 0 is entered: ");
		int count = 0;
		double num = 0;
		double sum = 0;
		double even = 0;
		count = scan.nextDouble();
		while (count != 0)
		{
			sum += count;
			num++;
			count = scan.nextDouble(); // JA: You have to read integers
			if (count % 2 == 0)
				even ++;
		}
		System.out.println("Number of even numbers: " + even);
		System.out.println("The total sum is: " + sum );
		System.out.print("The average is: " + sum/num);
			
		
	scan.close ();
		
	}

}
