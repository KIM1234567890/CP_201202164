package week5;

import java.util.Scanner;

class Rectangle {

	double height, width;
	
	public double area() {
		return height*width;
	}
	
	public double per() {
		return 2*(width + height);
	}	
}

public class TestRectangle {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		rectangle.height = sc.nextDouble();
		System.out.print("����: ");
		rectangle.width = sc.nextDouble();
		
		System.out.println("����: " + rectangle.area());
		System.out.println("�ѷ�: " + rectangle.per());
	}
}
