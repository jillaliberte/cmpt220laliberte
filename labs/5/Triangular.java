import java.util.Scanner;
public class Triangular {
		
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of rows and columns: ");
		int size = input.nextInt();
		double matrix[][] = new double [size][size];
			
	System.out.println("Enter " + size*size + " numbers: " );
		for (int i = 0; i < size; i++ ) {
			for (int j = 0; j < size; j++) {
				matrix[i][j]= input.nextInt();
				}
			}
	System.out.println( "original matrix: ");
		for (int i = 0; i < size; i++ ) {
			for (int j = 0; j < size;j++) {
				System.out.print(matrix[i][j]);
				
				}
				System.out.println (" ");
			}
		if (isUpperTriangular(matrix))
			System.out.println ("This is an upper triangular matrix ");
		else 
			System.out.println ("This is not an upper triangular matrix");
		input.close();
	}
	public static boolean isUpperTriangular(double[][] array) {
		for (int i = 0; i < array.length; i++ ) {
			for (int j = 0; j < array.length; j++) {
				if (i>j && array[i][j]>0) //JA
					return false;
				}	
			}
		return true; 
	}
	
}
