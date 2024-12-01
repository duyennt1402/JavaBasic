package week302;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create new bank account
		BankAccount account1 = new BankAccount("Duyen", "BIDV0102", 1000000);
		// account1.getBalance()
		System.out.println("Balance of account: " + account1.getBalance());
		System.out.println("Account nubmer is:" + account1.getAccountNumber());
		System.out.println(" Account detail: \n" +account1.getAccountInfo());
		// Deposit to account1
		Scanner sc = new Scanner(System.in);
		System.out.println("Input amount will be input to your account:");
		double amount1 = sc.nextDouble();
		// sc.close();
		account1.deposit(amount1);
		System.out.println("Balance of account after deposit: " + account1.getBalance());
		// Withdraw
		System.out.println("Input amount will be withdraw to your account:");
		double amount2 = sc.nextDouble();
		sc.close();
		account1.withdraw(amount2);

		System.out.println("Balance of account after withdraw: " + account1.getBalance());

	}

}
