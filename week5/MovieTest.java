package week5;

//import java.util.Scanner;

class Movie {

	String name = "";
	double score = 0;
	String direc = "";
	String rel = "";
	
	public void print() {
		System.out.println("����: " + name);
		System.out.println("����: " + direc);
		System.out.println("�����⵵: " + rel);
		System.out.println("����: " + score);
	}
}

public class MovieTest {
	
	public static void main(String[] args) {
		
		Movie movie = new Movie();
		//Scanner sc = new Scanner(System.in);
		
/*
 * 		System.out.print("����: ");
		movie.name = sc.nextLine();
		System.out.print("����: ");
		movie.direc = sc.nextLine();
		System.out.print("����: ");
		movie.rel = sc.nextLine();
		System.out.print("����: ");
		movie.score = sc.nextDouble();
 */
		movie.name = "��ǻ��";
		movie.direc = "������";
		movie.rel = "123123";
		movie.score = 12.3;
		
		movie.print();
	}
}
