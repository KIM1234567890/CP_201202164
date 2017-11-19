package week7;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // nextInt
		Scanner sc = new Scanner(System.in); // nextLine
		//BankAccount ba1 = new BankAccount(); //계좌1 정보 저장 
		//BankAccount ba2 = new BankAccount(); //게좌2 정보 저장
		BankAccount send = new BankAccount(); // 송금
		int num1, num2, mon1, mon2, a;
		String own1, own2;
		
		
		System.out.println("계좌 1 정보");
		System.out.print("계좌번호: ");
		num1 = in.nextInt();
		System.out.print("예금주: ");
		own1 = sc.nextLine();
		System.out.print("금액: ");
		mon1 = in.nextInt();		
		BankAccount ba1 = new BankAccount(own1, num1, mon1);
		
		System.out.println("계좌 2 정보");
		System.out.print("계좌번호: ");
		num2 = in.nextInt();
		System.out.print("예금주: ");
		own2 = sc.nextLine();
		System.out.print("금액: ");
		mon2 = in.nextInt();		
		BankAccount ba2 = new BankAccount(own2, num2, mon2);
		
		System.out.println("송금하실 금액을 입력");
		a = in.nextInt();				
		System.out.println("+++++++++++++++++++++++++++");		
		
		if(send.sendAccount(a, ba1, ba2) == 0) 
			System.out.println("돈없어서 못보냄");

	}	
}
