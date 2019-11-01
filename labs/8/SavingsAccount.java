
public class SavingsAccount 
		extends Account{
	private double overdrawLimit;
	
	public SavingsAccount() {
	}
	
	public SavingsAccount(int balance, double amount) {
		this.balance = balance;
		this.amount = amount; 
	}
	public double getOverdraw() {
		return overdrawLimit;
	}	
	public String toString() {
		if (withdraw(amount) < overdrawLimit) {
			return "The account is overdrawn";
	}
	return "balance: " + balance;
		
	}
}
