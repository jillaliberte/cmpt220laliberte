import java.util.Date;

public class Account {
	private int ID;
	public double balance;
	public double amount; 
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		ID = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();			
	}
	public Account (int ID, double balance) {
		this.ID = ID;
		this.balance = balance; 
		dateCreated = new Date();
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public double getAmount() {
		return amount;
	}
	public void setID(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public double getAnnual() {
		return annualInterestRate;
	}
	public void setAnnual(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return  annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return getMonthlyInterestRate()/100 ;
	}
	public double withdraw (double amount) {
		balance = balance - amount;
		return balance; 
	}
	public double deposit (double amount) {
		balance = balance + amount; 
		return balance;
	}
	public Date getDateCreated() {
		return dateCreated;
	}

}
