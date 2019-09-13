import java.util.Scanner;
public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter an lower and upper range (x y): ");
		int lower = input.nextInt();
		int upper = input.nextInt();
		int random = (int)(Math.random () * (upper - lower))  + lower; 
		int random2 = (int)(Math.random () * (upper - lower))  + lower; 
		int random3 = (int)(Math.random () * (upper - lower))  + lower; 
		System.out.println(random);
		System.out.println(random2);
		System.out.println(random3);
			
		
	input.close();
}
	
}
