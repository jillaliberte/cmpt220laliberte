import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of rows and columns: ");
		int size = input.nextInt();
		int matrix[][] = new int [size][size];
		
	System.out.println("Enter " + size*size + " numbers: " );
		for (int i = 0; i < size; i++ ) {
			for (int j = 0; j < size; j++) {
				matrix[i][j]= input.nextInt();
			}
		}
		System.out.println( "original matrix: ");
		for (int i = 0; i < size; i++ ) {
			for (int j = 0; j < size;j++) {
					System.out.print(matrix[i][j] + " ");
			}
			System.out.println (" ");
		}
		System.out.println( "transposed matrix: ");
		for (int i = 0; i < size; i++ ) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[j][i] + " ");
			}	
			System.out.println (" ");
		}	
		input.close();
		}
	}

