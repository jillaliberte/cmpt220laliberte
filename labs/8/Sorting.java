import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter 5 numbers to be sorted: "); 
		ArrayList <Number> list = new ArrayList<Number>();
		list.add (input.nextDouble());
		list.add (input.nextDouble());
		list.add (input.nextDouble());
		list.add (input.nextDouble());
		list.add (input.nextDouble());
		input.close();	
		
		sort(list);
		System.out.println (list.toString());
	}	
	public static void sort (ArrayList<Number> list) {
		for (int i = 0; i< list.size(); i++) {
			Number minimum = list.get(i);
			int index = 1;
			
			for (int j = i + 1; j< list.size(); j++) {
			if (minimum.doubleValue() > list.get(j).doubleValue()) {
				minimum = list.get(j);
				index = j;
				}
			}
		if (index != 1) {
			list.set(index, list.get(i));
			list.set(i, minimum);
			}
		}	
	}
}
