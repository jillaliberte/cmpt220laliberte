
public class TestAccount {
	public static void main (String[]args) {
		SavingsAccount account1 = new SavingsAccount (200000, 300000);
		CheckingAccount account2 = new CheckingAccount (200000, 300000);
		
		System.out.println ("Savings account balance: " + account1.toString());
		System.out.println ("Checking account balance: " + account2.toString());
	}
	
}
