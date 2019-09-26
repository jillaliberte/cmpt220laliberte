import java.util.Scanner;
public class AlmostPerfect {
	
	public static int total(int n) {
		int sum = 1;
		double root = Math.sqrt(n);
		
		if ((int)root == root) 
			sum = sum + (int)root;
		for (int i=2; i < root; i++) 
			if (n % i == 0) 
				sum = sum + i + (n/i);	
		return sum ;

	}
	
	 public static void main(String[] args)  {
	 Scanner input = new Scanner(System.in);
	
	 
	 while (input.hasNextInt()) {
	        int n = input.nextInt();
	        int sum = total(n);
	     
	        if (sum == n) { 
	        		System.out.println( n + " perfect");
	        }else if (Math.abs(sum-n) <= 2) {
	        		System.out.println (n + " almost perfect");
	        }else {
	            System.out.println(n + " not perfect"); 
	        }
	 }
	 input.close();
	 
	}
}

	

	 

	
		
		

