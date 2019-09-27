import java.util.Random;
public class Lowercase {
	public static void main (String[]args) {
		Random letter = new Random();
		char [][] characters = new char [5][5];
		
		for (int row = 0; row < characters.length; row++) {
			for (int column = 0; column < characters[row].length; column++) {
			characters[row][column] =  (char) (letter.nextInt(26) + 'a');
			System.out.print(characters[row][column]+ " ");
				
			}
			
			System.out.println();
	}
}
}
