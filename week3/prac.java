package week3;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mid, fin, prac;
		double aver;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============�ǽ�1 ����============");
		System.out.print("�߰���� ����: ");
		mid = sc.nextInt();
		
		System.out.print("�⸻��� ����: ");
		fin = sc.nextInt();
		
		System.out.print("�ǽ� ����: ");
		prac = sc.nextInt();
		
		aver = (mid + fin + prac) / 3.0;
		
		if(aver >= 96)
			System.out.println("A+");
		else if(aver >= 91)
			System.out.println("A");
		else if(aver >= 86)
			System.out.println("B+");
		else if(aver >= 81)
			System.out.println("B");
		else if(aver >= 76)
			System.out.println("C+");
		else if(aver >= 71)
			System.out.println("C");
		else if(aver >= 66)
			System.out.println("D+");
		else if(aver >= 61)
			System.out.println("D");
		else
			System.out.println("F");
		System.out.println("============�ǽ�1 ��============");		
		System.out.println("============�ǽ�2 ����============");
		
		int mon;
		mon = sc.nextInt();
		
		switch(mon) {
			
			case 1:
				;
			case 2:
				System.out.println("�ܿ�");
				break;
			case 3:
				;
			case 4:
				;
			case 5:
				System.out.println("��");
				break;
			case 6:
				;
			case 7:
				;
			case 8:
				System.out.println("����");
				break;
			case 9:
				;
			case 10:
				;
			case 11:
				System.out.println("����");
				break;
			case 12:
				System.out.println("�ܿ�");
				break;
			default:
				System.out.println("�߸��Է�");
			
		}
		
		System.out.println("============�ǽ�2 ��============");		
		System.out.println("============�ǽ�3 ����============");
		
		String str = "";
		
		while(true) {
			str = sc.nextLine();
			
			if(str.equals("exit"))
				break;
			else if(str.equals("09/25"))
				System.out.println("�ҹ�, �̿���, ���� ������, �Ķ�ũ��ä����, ���߱�ġ");
			else if(str.equals("09/26"))
				System.out.println("�ҹ�, ���ߵ��屹, �ҺҰ��, ���ĵκ�, ���߱�ġ");
			else if(str.equals("09/28"))
				System.out.println("�ҹ�, ���ڼ�����, �߰�������, ���Ƣ��, ���߱�ġ");
			else if(str.equals("09/29"))
				System.out.println("�ҹ�, ���� ���屹, ���Ұ��, ����ä����, ���߱�ġ");
			else if(str.equals("09/27"))
				System.out.println("�ҹ�, �δ��, ���α���, ��α�");
			else
				System.out.println("�ٽ� �Է� �Ͻÿ�");
		}
		
		System.out.println("============�ǽ�3 ��============");

	}

}
