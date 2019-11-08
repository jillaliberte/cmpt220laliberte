import java.util.Scanner;
public class BinaryString {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter a binary string: ");
		String testBinary = input.nextLine();
		
		 System.out.println (bin2Dec (testBinary));
		
		input.close();
	}
	public static int bin2Dec (String binary) throws NumberFormatException {
		int decimal = 0;
		for (int i = 0; i < binary.length(); i++) {
			int j =  binary.length()- 1;
			j--;
				if (binary.charAt (i)< '0'||binary.charAt(i)> '1')
					throw new NumberFormatException ("not a binary string");
				decimal += (Integer.parseInt(String.valueOf(binary.charAt(i)))) * Math.pow (2,j);
			}
			return decimal;
		}
}
