package chapter_7;

class BankAccount5 {
	String accNumber;
	String ssNumber;
	int balance;
	
	public BankAccount5(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public void checkMyBalance() {
		System.out.println("계좌번호: " + accNumber);
		System.out.println("주민번호: " + ssNumber);
		System.out.println("잔  액: " + balance);
	}
}

public class BankAccountConstructor {

	public static void main(String[] args) {
		BankAccount5 shin = new BankAccount5("12-34-89", "080116-3xxxxxx", 10000);
		BankAccount5 hwang = new BankAccount5("33-55-09", "080614-4xxxxxx", 10000);
		
		shin.deposit(5000);
		hwang.deposit(3000);
		shin.withdraw(2000);
		hwang.withdraw(2000);
		shin.checkMyBalance();
		hwang.checkMyBalance();
	}

}
