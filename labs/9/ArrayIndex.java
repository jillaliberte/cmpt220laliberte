import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[100];
		
		int random = (int)(Math.random()* 100);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random;
		}
		System.out.println ("Enter an index: ");
		int index = input.nextInt();
		
		try {
		System.out.println (array[index]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println ("out of bounds");
		}
		input.close();
	}

}
