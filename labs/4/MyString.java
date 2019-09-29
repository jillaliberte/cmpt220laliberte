import java.util.Scanner;
public class MyString {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter a string: ");
		String s = input.nextLine();
		System.out.println("reversed string: " + reverse(s));
		if (isPalindrome(s)) {
			System.out.print("the string is a palindrome");
		}else { 
			System.out.print("the string is not a palindrome");
		}
		
		input.close();	
		}
	
	
	public static String reverse(String s) {
		String rev = ""; // JA: Empty string
		char characters []= s.toCharArray();
		
		for (int i = (characters.length - 1); i >= 0; i--) {
			rev = rev + characters[i];
					}
			return rev;
				}
	
	public static boolean isPalindrome (String s) {
		boolean answer = false;
		String rev = reverse(s);
		if (s.equals(rev)) { // JA: You have to sue equals()
			answer = true;
		}
		return answer;
	}
	
	}

	
		

		
	

