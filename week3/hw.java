package week3;

import java.util.Scanner;

public class hw {
	
	public static void main(String[] args) {
		

		System.out.println("============����1 ����============");
		
		Scanner sc = new Scanner(System.in);
		
		int rand, num, win = 0, lose = 0, dr = 0;
		String com = "", user ="";
		
		while(true) {
			
			if(win == 3) {
				System.out.println("user win");
				break;
			}
			
			else if(lose == 3) {
				System.out.println("com win");
				break;
			}
			
			else {
				System.out.println("���� ���� �� �� �Է��϶�");
				rand = (int)(Math.random()*10) + 1;
				num = rand % 3;
				
				if(num == 0)
					com = "��";
				else if(num == 1)
					com = "����";
				else
					com = "����";			
				
				user = sc.nextLine();
				System.out.println("�ʴ� " + user);
				System.out.println("��ǻ�ʹ� " + com);
				
				if( (com.equals("��")&&user.equals("��")) ||
						(com.equals("����")&&user.equals("����")) ||
						(com.equals("����")&&user.equals("����"))) {
					System.out.println("���º�");
					dr++;
				}
				
				else if( (com.equals("��")&&user.equals("����")) ||
						(com.equals("����")&&user.equals("��")) ||
						(com.equals("����")&&user.equals("����"))) {
					System.out.println("�ϰ� �̱�");
					win++;;
				}
				
				else if( (com.equals("��")&&user.equals("����")) ||
						(com.equals("����")&&user.equals("����")) ||
						(com.equals("����")&&user.equals("��"))) {
					System.out.println("�ϰ� ��");
					lose++;
				}
				
				else 
					System.out.println("�߸� �Է�");
				
				System.out.println(win+""+"�� "+""+lose+"�� "+ ""+dr+""+"�� ");			
			}			
		}
		
		System.out.println("============����1 ��============");		
		System.out.println("============����2 ����============");
		
		//1900 01 01 �� ������, %4 == 0 && %100 != 0 && %400 ==0 ����
		
		//int an = 1900;
		//int mon = 1;
		//int day = 1;

		int anint = 0, monint = 0, dayint = 0;
		
		while(true) {
			
			System.out.print("��: ");
			anint = sc.nextInt();	
			
			if(anint < 1900) {
				System.out.println("���� ���� 1900�̻��� ���� �Է��� �ּ���");
			}
			
			else {
				System.out.println("�Է��Ͻ� �⵵�� " + "" + anint + "�� �Դϴ�");
				break;
			}
		}
		
		while(true) {
			
			System.out.print("��: ");
			monint= sc.nextInt();
			
			if((monint < 1) || (monint > 12)) {
				System.out.println("���� ���� 1�̻� 12������ ������ �Է��Ͽ� �ּ���");
				continue;
			}
			
			else {
				System.out.println("�Է��Ͻ� ���� " + "" + monint + "" + "�� �Դϴ�");
				break;
			}
		}
				
		while(true) {			
						
			System.out.print("��: ");
			dayint = sc.nextInt();
			
			if(monint == 2) {
						
				
				if((anint % 4 == 0)&&(anint % 100 != 0)||(anint % 400 == 0)) {
					//1-29
					
					
					if((dayint < 1) || (dayint > 29)) {
						System.out.println("�����Դϴ� 1���� 29������ �� �Է��Ͽ��ּ���");
					}
					else {
						System.out.println("�Է��Ͻ� ���� " + "" +  dayint + "" + "�Դϴ�");
						break;
					}
				}
				
				else {
					if((dayint < 1) || (dayint > 28)) {
						System.out.println("������ �ƴմϴ� 1���� 28������ �� �Է��ϼ���");
					}
					else {
						System.out.println("�Է��Ͻ� ���� " + "" +  dayint + "" + "�Դϴ�");
						break;
					}
					//1-28
				}
			} // 2�� ����		
			
			else if((monint == 4) || (monint == 6) || (monint == 9) || (monint == 11)) {
				
				if((dayint < 1) || (dayint > 30)) {
					System.out.println("1���� 30������ �� �Է��ϼ���");
				}
				
				else {
					System.out.println("�Է��Ͻ� ���� " + "" +  dayint + "" + "�Դϴ�");
					break;
				}
			}
			
			else {
				if((dayint < 1) || (dayint > 31)) {
					System.out.println("1���� 31������ �� �Է��ϼ���");
				}
				
				else {
					System.out.println("�Է��Ͻ� ���� " + "" +  dayint + "" + "�Դϴ�");
					break;
				}
			}
		}
		
		int th = 0;
		
		for(int ann = 1900; ann < anint; ann++) {
					
			if((ann % 4 == 0)&&(ann % 100 != 0)||(ann % 400 == 0))
				th += 366;
			else
				th += 365;
		}
		
		for(int monn = 1; monn < monint; monn++) {
			
			if(monn == 2) {
				
				if((anint % 4 == 0)&&(anint % 100 != 0)||(anint % 400 == 0)) {
					th += 29;
				}
				
				else 
					th += 28;
			}
							
			
			else if((monn == 4)||(monn == 6)||(monn == 9)||(monn == 11)) 
				th += 30;			
		
			else 
				th += 31;
		}
		
		int dat = th + dayint - 1;
		
		System.out.print("1900�� 1�� 1���� �������̸�, �� ���� ���� " + "" + dat + "���� ������. ���� " + anint + "�� " + "" + monint + "" +"��  " + "" + dayint + "���� ");
		
		int dow = dat & 7;
		
		switch(dow) {
		
		case 0:
			System.out.println("�������̴�");
			break;
		
		case 1:
			System.out.println("ȭ�����̴�");
			break;
			
		case 2:
			System.out.println("�������̴�");
			break;
			
		case 3:
			System.out.println("������̴�");
			break;
			
		case 4:
			System.out.println("�ݿ����̴�");
			break;
			
		case 5:
			System.out.println("������̴�");
			break;
			
		case 6:
			System.out.println("�Ͽ����̴�");
			break;
					
		}
				
		System.out.println("============����2 ��============");
		
		
	}
}
