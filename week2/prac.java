package week2;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fir, sec, thr, rad;
		double aver, surf, pi;
		
		pi = Math.PI;
		
		
		System.out.print("안녕하세요.");
		System.out.println("저는 입니다");
		System.out.println("컴퓨터 공학과 이며 이번 프로그래밍 수업");
		System.out.println("에서 자바 프로그래밍이 기반을 만드는 것이 목표");
		System.out.print("입니다");
		
		System.out.println();
		
		System.out.print("첫 번쨰수: ");
		fir = sc.nextInt();
		System.out.print("두 번쨰수: ");
		sec = sc.nextInt();
		System.out.print("세 번쨰수: ");
		thr = sc.nextInt();
		
		aver = (fir + sec + thr) / 3.0;
		
		System.out.println("평균은 " + "" + aver);
		
		System.out.print("반지름을 입력하시오  ");
		rad = sc.nextInt();
		
		surf = rad*rad*pi;
		
		System.out.println("원의 넓이는 " + "" + surf + "" +" 입니다");

		int a, b, c;
		
		System.out.print("첫 번째 수: ");
		a = sc.nextInt();
		System.out.print("두 번째 수: ");
		b = sc.nextInt();
		
		c = a > b ? a : b;
		
		System.out.println("큰 수는 " + "" + c + "" + "입니다");
		
		
		int hour, min, se, vir;
		
		System.out.print("몇 초?? ");
		se = sc.nextInt();
		vir = se;
		
		hour = se / 3600;
		se = se - (hour * 3600);
		
		min = se / 60;
		
		se = se - (min * 60);
		
			
		System.out.println(vir + "초는 " + "" + hour + "" + "시간 " + "" + min + "" + "분" + "" + se + "" +"초 입니다");
		
		int yoon;
		
		System.out.println("몇년 ??");
		yoon = sc.nextInt();
		
		if((yoon % 4 == 0)&&(yoon % 100 != 0)||(yoon % 400 ==0 )) {
			
			System.out.println("윤년");
		}
		
		else {
			System.out.println("노 윤년");
		}
	}
}


