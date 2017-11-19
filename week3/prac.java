package week3;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mid, fin, prac;
		double aver;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============실습1 시작============");
		System.out.print("중간고사 성적: ");
		mid = sc.nextInt();
		
		System.out.print("기말고사 성적: ");
		fin = sc.nextInt();
		
		System.out.print("실습 점수: ");
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
		System.out.println("============실습1 끝============");		
		System.out.println("============실습2 시작============");
		
		int mon;
		mon = sc.nextInt();
		
		switch(mon) {
			
			case 1:
				;
			case 2:
				System.out.println("겨울");
				break;
			case 3:
				;
			case 4:
				;
			case 5:
				System.out.println("봄");
				break;
			case 6:
				;
			case 7:
				;
			case 8:
				System.out.println("여름");
				break;
			case 9:
				;
			case 10:
				;
			case 11:
				System.out.println("가을");
				break;
			case 12:
				System.out.println("겨울");
				break;
			default:
				System.out.println("잘못입력");
			
		}
		
		System.out.println("============실습2 끝============");		
		System.out.println("============실습3 시작============");
		
		String str = "";
		
		while(true) {
			str = sc.nextLine();
			
			if(str.equals("exit"))
				break;
			else if(str.equals("09/25"))
				System.out.println("쌀밥, 미역국, 자장 떡볶이, 후랑크야채볶음, 배추김치");
			else if(str.equals("09/26"))
				System.out.println("쌀밥, 배추된장국, 소불고기, 마파두부, 배추김치");
			else if(str.equals("09/28"))
				System.out.println("쌀밥, 감자수제비, 닭간장조림, 춘권튀김, 배추김치");
			else if(str.equals("09/29"))
				System.out.println("쌀밥, 유부 된장국, 돈불고기, 감자채볶음, 배추김치");
			else if(str.equals("09/27"))
				System.out.println("쌀밥, 부대찌개, 만두구이, 깍두기");
			else
				System.out.println("다시 입력 하시오");
		}
		
		System.out.println("============실습3 끝============");

	}

}
