package week2;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fir, sec, thr, rad;
		double aver, surf, pi;
		
		pi = Math.PI;
		
		
		System.out.print("�ȳ��ϼ���.");
		System.out.println("���� �Դϴ�");
		System.out.println("��ǻ�� ���а� �̸� �̹� ���α׷��� ����");
		System.out.println("���� �ڹ� ���α׷����� ����� ����� ���� ��ǥ");
		System.out.print("�Դϴ�");
		
		System.out.println();
		
		System.out.print("ù ������: ");
		fir = sc.nextInt();
		System.out.print("�� ������: ");
		sec = sc.nextInt();
		System.out.print("�� ������: ");
		thr = sc.nextInt();
		
		aver = (fir + sec + thr) / 3.0;
		
		System.out.println("����� " + "" + aver);
		
		System.out.print("�������� �Է��Ͻÿ�  ");
		rad = sc.nextInt();
		
		surf = rad*rad*pi;
		
		System.out.println("���� ���̴� " + "" + surf + "" +" �Դϴ�");

		int a, b, c;
		
		System.out.print("ù ��° ��: ");
		a = sc.nextInt();
		System.out.print("�� ��° ��: ");
		b = sc.nextInt();
		
		c = a > b ? a : b;
		
		System.out.println("ū ���� " + "" + c + "" + "�Դϴ�");
		
		
		int hour, min, se, vir;
		
		System.out.print("�� ��?? ");
		se = sc.nextInt();
		vir = se;
		
		hour = se / 3600;
		se = se - (hour * 3600);
		
		min = se / 60;
		
		se = se - (min * 60);
		
			
		System.out.println(vir + "�ʴ� " + "" + hour + "" + "�ð� " + "" + min + "" + "��" + "" + se + "" +"�� �Դϴ�");
		
		int yoon;
		
		System.out.println("��� ??");
		yoon = sc.nextInt();
		
		if((yoon % 4 == 0)&&(yoon % 100 != 0)||(yoon % 400 ==0 )) {
			
			System.out.println("����");
		}
		
		else {
			System.out.println("�� ����");
		}
	}
}


