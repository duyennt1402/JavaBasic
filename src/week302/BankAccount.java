package week302;

public class BankAccount {
	/*
	 * Create a class BankAccount which: Have: Account number, account holder,
	 * balance Can: deposit - increase the balance, withdraw - decreases the
	 * balance, if there are sufficient funds, show balance, show account details
	 */
	String accountName;
	String accountNumber;
	double balance;

	// Constructor for BankAccount class which initializes account number, account
	// holder name, and balance variable
	public BankAccount(String accountName, String accountNumber, double balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}
	// Method to show balance
	public double getBalance() {
		return balance;
	}
	//Method to show account nubmer
	public String getAccountNumber() {
		return accountNumber;
		}
	// get account detail
	public String getAccountInfo() {
		return "Account name" + accountName +", Account number " + accountNumber+", balance "+ balance;
	}
	//Method to deposit 
	public void deposit(double amount) {
		balance += amount;
	}
	//Method to withdraw 
	public void withdraw(double amount) {
		balance -= amount;
	}
}
