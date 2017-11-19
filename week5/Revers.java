package week5;

import java.util.Scanner;

public class Revers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");		
		String str = sc.nextLine();
		
		for(int i = str.length() - 1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
