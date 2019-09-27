
import java.util.Scanner;
public class Order {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[100];
		int i = 0;
		int j = 0;
		int num = 1;
		
		System.out.println("Enter a number to be put in an array. Enter '0' to stop");
		while (num != 0) {
			num = input.nextInt();
			numbers[i] = num;
			i++;
		} 
		
		numbers = bubbleSort(numbers);
		for (j = 101-i; j < 100; j++) {
			System.out.print(numbers[j] + " ");
			  input.close();
		} 
	} 
	

	public static int[] bubbleSort(int[] array) {
	    boolean change = true;
	    int j = 0;
	    int tmp;
	    while (change) {
	        change = false;
	        j++;
	        for (int i = 0; i < array.length - j; i++) {
	            if (array[i] > array[i + 1]) {
	                tmp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = tmp;
	                change = true;
	            } 
	        } 
	    } 
	    return array;
	
	} 
}

