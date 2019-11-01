
public class CheckingAccount 
		extends Account{
	private double overdraftLimit = 20000000;

	public CheckingAccount() {
}
	public CheckingAccount(int balance, double amount) {
	this.balance = balance;
	this.amount = amount;
}

	public String toString() {
		if (deposit(amount) > overdraftLimit) {
			return "The account exceeds the overdraft limit";
		}
		return "balance: " + balance;
			
		}
	}


