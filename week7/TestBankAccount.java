package week7;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // nextInt
		Scanner sc = new Scanner(System.in); // nextLine
		//BankAccount ba1 = new BankAccount(); //����1 ���� ���� 
		//BankAccount ba2 = new BankAccount(); //����2 ���� ����
		BankAccount send = new BankAccount(); // �۱�
		int num1, num2, mon1, mon2, a;
		String own1, own2;
		
		
		System.out.println("���� 1 ����");
		System.out.print("���¹�ȣ: ");
		num1 = in.nextInt();
		System.out.print("������: ");
		own1 = sc.nextLine();
		System.out.print("�ݾ�: ");
		mon1 = in.nextInt();		
		BankAccount ba1 = new BankAccount(own1, num1, mon1);
		
		System.out.println("���� 2 ����");
		System.out.print("���¹�ȣ: ");
		num2 = in.nextInt();
		System.out.print("������: ");
		own2 = sc.nextLine();
		System.out.print("�ݾ�: ");
		mon2 = in.nextInt();		
		BankAccount ba2 = new BankAccount(own2, num2, mon2);
		
		System.out.println("�۱��Ͻ� �ݾ��� �Է�");
		a = in.nextInt();				
		System.out.println("+++++++++++++++++++++++++++");		
		
		if(send.sendAccount(a, ba1, ba2) == 0) 
			System.out.println("����� ������");

	}	
}
