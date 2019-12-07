
	import java.util.HashMap;
	import java.util.Scanner;

	public class UserInput {
		public static void main (String[] args) {
			Scanner input = new Scanner (System.in);
			int action = 0;
			HashMap <String, String> storage = new HashMap <String, String>();
			
			Cryptography crypto = new EncryptDecrypt();
			
			do {
				System.out.println("Password Storage Options");
				System.out.println("1 - add");
				System.out.println("2 - view old");
				
				System.out.print("Enter the action on the password safe: ");
				action = input.nextInt();
		
				
				switch (action) {
				case 1:
					System.out.println ("Enter the four digit master key: ");
					if (input.nextInt() == 1234) { 	
						
						System.out.println ("Enter the website and password sepratated by a space; ");
						String inputWebsite = input.nextLine();	
						String inputPass = input.nextLine();
						
						String encrypted = new String (crypto.encrypt(inputPass.getBytes()));
						
						storage.put(inputWebsite, encrypted);
						}
						
					
					else  {
						
					System.out.println ("incorrect  master key."); 
				}
		
					break;
					
				case 2:
					System.out.println ("Enter the four digit master key: ");
					if (input.nextInt() == 1234) {
						
						System.out.println ("Enter the website: ");
						String thisWebsite = input.nextLine();
						
						String encrypted = storage.get(thisWebsite);
						
						String decrypted = new String (crypto.decrypt(encrypted.getBytes()));
						
						storage.replace (thisWebsite, decrypted);
						System.out.println (storage);
					}
						else  {
							System.out.println ("incorrect  master key.");	
						} 
						break;
				}
			} while (action != 3);
		input.close();
		}
	}
