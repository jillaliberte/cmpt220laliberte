import java.io.*;
import java.util.*;

public class Removes {

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java RemoveText sourceFile ");
			System.exit(1);
		}
		File sourceFile = new File (args[1]);
		if (!sourceFile.exists()) {
			System.out.println (args[1]+ "does not exist");
			System.exit(2);
		}
		
		String s = "";
		try {
			Scanner input = new Scanner(sourceFile);
				while (input.hasNext()) {
					s += input.nextLine();
				}
				input.close();
			}
		
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		s = s.replaceAll(args[0], "");
		try {
			PrintWriter output = new PrintWriter (sourceFile);
			System.out.println(s);
			output.write (s);
			output.close();
		}
		
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println ("Complete");
		}
}
