package week7;

public class BankAccount {
	
	String owner; //������
	int accountNumber; //���¹�ȣ
	int balance = 0; //�ܾ�
	
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
	void deposit(int amount) { //����
		balance = balance + amount;
	}
	
	void withdraw(int amount) { //����
		balance = balance - amount;
	}
		
	public String toString() {
		return "�ܾ�: " + balance;
	}
	
	public int sendAccount(int amount, BankAccount ba1, BankAccount ba2) {
		
		if(amount > ba1.balance) return 0;
		
		else {			
			ba2.deposit(amount);
			ba1.withdraw(amount);
			
			System.out.println("����1");
			System.out.println("���¹�ȣ: " + ba1.accountNumber);
			System.out.println("������: " + ba1.owner);
			System.out.println(ba1.toString());
						
			System.out.println("\n����2");
			System.out.println("���¹�ȣ: " + ba2.accountNumber);
			System.out.println("������: " + ba2.owner);
			System.out.println(ba2.toString());			
			return 1;
		}
	}
}
