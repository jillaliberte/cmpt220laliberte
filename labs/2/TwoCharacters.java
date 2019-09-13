import java.util.Scanner;
public class TwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
	System.out.print ("Enter a character: ");
	char first = input.nextLine().charAt(0);
	System.out.print ("Enter another character: ");
	char second = input.nextLine().charAt(0);
			
	System.out.print (first + second);
	input.close ();
	}

}
