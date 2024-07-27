package chapter_7;

class BankAccount1 {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public  int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}


public class BankAccountOO {
	public static void main(String[] args) {
		// 두 개의 인스턴스 생성
		BankAccount1 yoon = new BankAccount1();
		BankAccount1 park = new BankAccount1();
		
		// 각 인스턴스 대상으로 예금을 진행
		yoon.deposit(5000);
		park.deposit(3000);
		
		// 각 인스턴스 대상으로 출금을 진행
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		// 각 인스턴스 대상으로 잔액을 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}