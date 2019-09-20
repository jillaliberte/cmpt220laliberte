import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String read = input.nextLine();
		System.out.println("Number of vowels: "+ vowels(read));
		input.close ();
	}
	public static int vowels (String read) {
		int count = 0;
		for (int i = 0; i < read.length();i++) {
			if (read.charAt(i) == 'a'||read.charAt(i) ==  'e'|| read.charAt(i) == 'i'||read.charAt(i) == 'o'||read.charAt(i) == 'u') {
				count ++;
			}
		}
		return count;
	}
}
