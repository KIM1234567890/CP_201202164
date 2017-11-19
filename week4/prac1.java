package week4;

import java.util.Scanner;

public class prac1 {
	
	public static void main(String[] args) {
		
		int a , b, c, d = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======실습 1========");
		for(a = 1; a < 10; a++) {
			System.out.print(a + "" + "단: ");
			for(b = 1; b < 10; b++) {
				
				if(a*b < 10)
					System.out.print(" "+""+a*b +"    ");
				else
					System.out.print(a*b + "    ");
			}
			System.out.println();
		}
		
		System.out.println("=======실습 1 끝========");
		
		System.out.println("=======실습 2========");
		
		int q = 1, w = 1;
		
		
		for(; q <= 11; q++) {
			
				
			if(q <= 6) {
				for(w = 1; w <= q; w++) {
					System.out.print("*");
				}
			}		
			
			else {
				
			}
			System.out.println();
						
		}
		
//		for(q = 1; q <= 11; q++) {
//			
//			if(q <= 6) {
//				
//				for(w = 1; w <= q; w++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			
//			else {
//				for(w = q;w <= 11;w++) {
//					System.out.print("*");
//				}
//				System.out.println();	
//			}
//		}
//		System.out.print("몇층짜리 할까??? ");
//		
//		int num = sc.nextInt();
//	
//		for(c = 1; c <= num; c++) {
//			
//			for(d = 0; d < c; d++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//System.out.println(c);
//		//System.out.println(d);
//		
//		for(c = num;c > 1; c--) {
//			
//			for(d = 1; d < c; d++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}			
		
		
		
		System.out.println("=======실습 2 끝========");
	}

}
