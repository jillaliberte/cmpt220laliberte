import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int[] numbers = new int[20];
		int array = 0;
		int num = 1;
		
		System.out.println("Enter numbers into the array, enter 0 to stop");
		while (num != 0) {
			num = input.nextInt();
			numbers[array] = num;
			array++;
		}
		

		int limit = numbers.length;

	    for (int i = 0; i < limit; i++) {
	        for (int j = i + 1; j < limit; j++) {
	            if (numbers[i] == numbers[j]) {                  
	                int push = j;
	                

	                for (int k = j+1; k < limit; k++, push++) {
	                    numbers[push] = numbers[k];
	                } 
	               

	                limit--;
	                j--;
	            }
	        } 
	    }

	    int[] duplicate = new int[limit];
	  

	    for(int i = 0; i < limit; i++){
	        duplicate[i] = numbers[i];
	    } 
	    

	    System.out.println(Arrays.toString(duplicate));
	    input.close();
	} 
} 
