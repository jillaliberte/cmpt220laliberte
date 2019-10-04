import java.util.Scanner;

public class StudentScores {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		String names[] = new String [input.nextInt()];
		int scores[] = new int [names.length];
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println ("Enter the student's name:  ");
			names[i]=input.next();
			System.out.print("What was their score?: ");
			scores [i]=input.nextInt();
		}
		
		sort (names, scores);
		int index = 0;
		
		for (String output: names) {
			System.out.print (output+ " ");
			System.out.println (scores[index++]);
		}
		
 input.close();
		}
	
	public static void sort (String[]students, int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			int max = grades[i];
			int count = i;
			String nameSort; 
			
			for (int j = i + 1; j < grades.length; j++) {
				if (grades[j] < max) {
					max = grades [j];
					count = j;
				}		
		}
			if (count != i) {
				nameSort = students [i];
				students [i] = students [count];
				students[count] = nameSort; 
				
			}
				
		}
	}
	
}


	