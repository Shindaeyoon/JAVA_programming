package chapter_7;

import java.awt.Checkbox;

class BankAccount3 {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}


public class PassingRef {
	public static void main(String[] args) {
		BankAccount3 ref = new BankAccount3();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
	}
	
	public static void check(BankAccount3 acc) {
		acc.checkMyBalance();
	}

}
