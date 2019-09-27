import java.util.Scanner;
public class Average {
	public static void main (String[] args ) {
		Scanner input = new Scanner (System.in);
		double [] numbers = new double [1000];
		double sum = 0;
		
	
	for (int i = 0; i < numbers.length; i++) {
		Double random = (Math.random()* (100000 - 1));
		numbers [i] =  random;
		sum = sum + numbers [i];
	}
	
	double average = sum/1000;
	
	int greater = 0;
	int less = 0;
	for (int i = 0; i < 1000; i++)
		if (numbers[i] > average)
			greater ++;
		else if (numbers[i]< average)
			less ++;
	
	
	System.out.println("the average is: " + average);
	System.out.println("there are " + greater + " numbers greater than the average");
	System.out.println("there are " + less + " numbers less than the average");
	
	input.close();
		
}
}
