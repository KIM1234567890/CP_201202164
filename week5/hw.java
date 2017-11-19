package week5;

import java.util.Scanner;

class Date {

	String ann, month, day;

	public void orient() {
		System.out.println("�����: " + ann + ". " + month + ". " + day);
	}

	public void occident() {
		
		switch(month) {
			
		case "1": month = "JAN"; break;
		case "2": month = "FEB"; break;
		case "3": month = "MAR"; break;
		case "4": month = "APR"; break;
		case "5": month = "MAY"; break;
		case "6": month = "JUN"; break;
		case "7": month = "JUL"; break;
		case "8": month = "AUG"; break;
		case "9": month = "SEP"; break;
		case "10": month = "OCT"; break;
		case "11": month = "NOB"; break;
		case "12": month = "DEC"; break;
			
		default: break;
		}
		
		System.out.println("�����: " +  month + " " + day + ", " + ann);
	}
}

public class hw {

	public static void main(String[] args) { 

		System.out.println("===============���� 1 ����===============");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� �Է�: ");

		String str = sc.nextLine();
		
		int con = 0, vow = 0, i;
		for(i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			switch(ch) {

			case 'a': case 'A': case 'e': case 'E': case 'i': 
			case 'I': case 'o': case 'O': case 'u': case 'U':
				vow++;
				break;
			case 'b': case 'B': case 'c': case 'C': case 'd': case 'D':
			case 'f': case 'F': case 'g': case 'G': case 'h': case 'H':
			case 'j': case 'J': case 'k': case 'K': case 'l': case 'L':
			case 'm': case 'M': case 'p': case 'P': case 'q': case 'Q':
			case 'r': case 'R': case 's': case 'S': case 't': case 'T':
			case 'v': case 'V': case 'w': case 'W': case 'y': case 'Y':
			case 'x': case 'X': case 'z': case 'Z':
				con++;
				break;
			default:
				break;
			}
		}

		System.out.println("����: " + con + "" + "  ����: " + vow);

		//System.out.println("===============���� 1 ��===============");

		System.out.println("\n\n\n===============���� 2 ����===============");
		System.out.println("�ٲ�� �� ���ڿ�: " + str);
		System.out.print("�ٲ�� ���ڿ�: ");
		
		for(i = 0; i < str.length(); i++) {

//			int a = (int)str.charAt(i);
//
//			if((a >= 65)&&(a <= 90))
//				System.out.print((char)(a + 32));
//			else if((a >= 97)&&(a <= 122))
//				System.out.print((char)(a - 32));
//			else
//				System.out.print((char)a);		
			
			if(((int)str.charAt(i) >= 65) && ((int)str.charAt(i)<= 90))
				System.out.print((char)(str.charAt(i) + 32));
			else if(((int)str.charAt(i) >= 97) && ((int)str.charAt(i)<= 122))
				System.out.print((char)(str.charAt(i) - 32));
			else 
				System.out.print(str.charAt(i));
		}
				
		System.out.println("\n\n\n===============���� 3 ����===============");

		Date date = new Date();
		
		System.out.print("��: ");
		date.ann = sc.nextLine();
		System.out.print("��: ");
		date.month = sc.nextLine();
		System.out.print("��: ");
		date.day = sc.nextLine();
		
		date.orient();
		date.occident();
		
	}
}
