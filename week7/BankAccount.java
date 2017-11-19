package week7;

public class BankAccount {
	
	String owner; //예금주
	int accountNumber; //계좌번호
	int balance = 0; //잔액
	
	public BankAccount(String owner, int accountNumber, int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public BankAccount() {
		owner = "0";
		accountNumber = 0;
		balance = 0;
	}
	void deposit(int amount) { //저금
		balance = balance + amount;
	}
	
	void withdraw(int amount) { //인출
		balance = balance - amount;
	}
		
	public String toString() {
		return "잔액: " + balance;
	}
	
	public int sendAccount(int amount, BankAccount ba1, BankAccount ba2) {
		
		if(amount > ba1.balance) return 0;
		
		else {			
			ba2.deposit(amount);
			ba1.withdraw(amount);
			
			System.out.println("계좌1");
			System.out.println("계좌번호: " + ba1.accountNumber);
			System.out.println("예금주: " + ba1.owner);
			System.out.println(ba1.toString());
						
			System.out.println("\n계좌2");
			System.out.println("계좌번호: " + ba2.accountNumber);
			System.out.println("예금주: " + ba2.owner);
			System.out.println(ba2.toString());			
			return 1;
		}
	}
}
