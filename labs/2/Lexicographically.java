import java.util.Scanner;
public class Lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
	System.out.println ("Enter a string: ");
	String name = input.nextLine();
	System.out.println ("Enter another string: ");
	String name2 = input.nextLine();
	int result = (name.compareTo(name2));
	if (result < 0) {
		System.out.println ("1. " + name);
		System.out.println ("2. " + name2 );	
	} else if (result == 0) {
		System.out.println ("The strings are equal");
	} else if (result > 0) {
		System.out.println ("1. "+ name2);
		System.out.println ("2. " + name );	
	}
	input.close(); 
}

}