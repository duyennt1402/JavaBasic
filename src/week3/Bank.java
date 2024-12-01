package week3;

import java.util.ArrayList;

//Define the Bank class
public class Bank {

// Declare an ArrayList to store Account objects
private ArrayList<BankAccount> accounts;

// Constructor for the Bank class
public Bank() {
 // Initialize the accounts ArrayList
 accounts = new ArrayList<BankAccount>();
}

// Method to add an Account to the accounts list
public void addAccount(BankAccount account) {
 // Add the given account to the accounts ArrayList
 accounts.add(account);
}

// Method to remove an Account from the accounts list
public void removeAccount(BankAccount account) {
 // Remove the given account from the accounts ArrayList
 accounts.remove(account);
}

// Method to deposit money into a specific Account
public void depositMoney(BankAccount account, double amount) {
 // Call the deposit method on the given account with the specified amount
 account.deposit(amount);
}

// Method to withdraw money from a specific Account
public void withdrawMoney(BankAccount account, double amount) {
 // Call the withdraw method on the given account with the specified amount
 account.withdraw(amount);
}

// Method to get the list of all accounts
public ArrayList<BankAccount> getAccounts() {
 // Return the accounts ArrayList
 return accounts;
}
} 