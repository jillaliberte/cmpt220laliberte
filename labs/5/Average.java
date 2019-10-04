import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns: ");
			int row = input.nextInt();
			int col = input.nextInt();
			double matrix[][] = new double [row][col];
		
			
		System.out.println("Enter " + row*col + " numbers: " );
			for (int i = 0; i < row; i++ ) {
				for (int j = 0; j < col; j++) {
					matrix[i][j]= input.nextInt();
				}	
			}
			System.out.println( "original matrix: ");
			for (int i = 0; i < row; i++ ) {
				for (int j = 0; j < col;j++) {
						System.out.print(matrix[i][j] + " ");
				}
			
				System.out.println (" ");
			}
		System.out.print(" Which row would you like the average of? ");
		int average = input.nextInt();
		
		System.out.println (averageRow(matrix, average));	
		input.close();
	}
	public static double averageRow(double[][] array, int row) {
		double sum = 0;
		for (int i = 0; i < array.length; i++ ) {
			sum = sum + array[row][i];
				
				}
			double average = sum/array.length;
			return average;
		}
		

}
