
public class SortAppliances {
	public static void main (String args[]) {
		Appliance[] appliances = {
				
				new Toaster (30, "silver", "china", 80),
				new TV (20, "silver", "japan", 200),
				new Telephone (40, "black", "america", 50),
				new Toaster (50, "gold", "china", 89),
				new TV (60, "purple", "america", 350),
				new Telephone (10, "silver", "china", 78),
				new Toaster (20, "gold", "france", 69),
				new TV (30, "black", "spain", 98),
				new Telephone (50, "red", "china", 91),
				new Toaster (30, "yellow", "japan", 76),
				new TV (40, "silver", "america", 430),
				new Telephone (20, "blue", "france", 200),
				new Toaster (80, "green", "mexico", 83),
				new TV (90, "gold", "spain", 230),
				new Telephone (120, "black", "china", 94),
				new Toaster (40, "silver", "china", 85),
				new TV (50, "white", "japan", 99),
				new Telephone (30, "blue", "mexico", 39),
				new Toaster (50, "yellow", "spain", 86),
				new TV (100, "red", "china", 45),
				new Toaster (30, "silver", "china", 80),
				new TV (20, "silver", "japan", 200),
				new Telephone (40, "black", "america", 50),
				new Toaster (50, "gold", "china", 89),
				new TV (60, "purple", "america", 350),
				new Telephone (10, "silver", "china", 78),
				new Toaster (20, "gold", "france", 69),
				new TV (30, "black", "spain", 98),
				new Telephone (50, "red", "china", 91),
				new Toaster (30, "yellow", "japan", 76),
				new TV (40, "silver", "america", 430),
				new Telephone (20, "blue", "france", 200),
				new Toaster (80, "green", "mexico", 83),
				new TV (90, "gold", "spain", 230),
				new Telephone (120, "black", "china", 94),
				new Toaster (40, "silver", "china", 85),
				new TV (50, "white", "japan", 99),
				new Telephone (30, "blue", "mexico", 39),
				new Toaster (50, "yellow", "spain", 86),
				new TV (100, "red", "china", 45),
				};
				
				java.util.Arrays.sort(appliances);
				for (Appliance TV: appliances) {
					System.out.println (TV + " ");
					System.out.println ( );
		}		
	}
}


