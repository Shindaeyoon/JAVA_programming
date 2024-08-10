package chapter_7;

class BankAccount4 {
	String accNumber; // 계좌번호
	String ssNumber; // 주민번호
	int balance = 0; // 잔액
	
	// 초기화를 위한 메소드
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal; // 계좌 개설 시 잔액으로 초기화
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
		System.out.println("잔   액: " + balance + '\n');
	}
}

public class BankAccountUniID {

	public static void main(String[] args) {
		BankAccount4 shin = new BankAccount4(); // 계좌 생성
		shin.initAccount("12-34-89", "080116-3xxxxxx", 10000); // 초기화
		
		BankAccount4 hwang = new BankAccount4(); // 계좌 생성
		hwang.initAccount("33-55-09", "080614-4xxxxxx", 10000); // 초기화
		
		shin.deposit(5000);
		hwang.deposit(3000);
		shin.withdraw(2000);
		hwang.withdraw(2000);
		shin.checkMyBalance();
		hwang.checkMyBalance();

	}

}
