package week4;
import java.util.Scanner;

public class hw {
	
	public static void main(String[] args) {
		
		System.out.println("===========���� 1 ����===========");
		int a = 0, b = 1, var = 0;
		
		for(int c = 0; c < 10; c++) {
			System.out.print(a + " ");
			var = a + b;
			a = b;
			b = var;
		}
		System.out.println();
		System.out.println("===========���� 1 ��===========");
		
		
		System.out.println("===========���� 2 ����===========");
		
		 char ch = 0;		 
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			 
			 ch = sc.next().charAt(0);
					 
			 if(ch == '~')
				 break;
			 
			 switch(ch) {
			 
			 case 'a': case 'A': case 'e': case 'E': case 'i': 
		     case 'I': case 'o': case 'O': case 'u': case 'U':
				 System.out.println("�����Դϴ�.");
				 break;
		     case 'b': case 'B': case 'c': case 'C': case 'd': case 'D':
		     case 'f': case 'F': case 'g': case 'G': case 'h': case 'H':
		     case 'j': case 'J': case 'k': case 'K': case 'l': case 'L':
		     case 'm': case 'M': case 'p': case 'P': case 'q': case 'Q':
		     case 'r': case 'R': case 's': case 'S': case 't': case 'T':
		     case 'v': case 'V': case 'w': case 'W': case 'y': case 'Y':
		     case 'x': case 'X': case 'z': case 'Z':
		    	 System.out.println("���� �Դϴ�");
		    	 break;
			 default:
				System.out.println("�߸��Է��߽��ϴ�.");
				break;
			 }
			 

		 }		 
		
		System.out.println("===========���� 2 ��===========");
	}
}
