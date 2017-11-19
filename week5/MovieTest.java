package week5;

//import java.util.Scanner;

class Movie {

	String name = "";
	double score = 0;
	String direc = "";
	String rel = "";
	
	public void print() {
		System.out.println("제목: " + name);
		System.out.println("감독: " + direc);
		System.out.println("개봉년도: " + rel);
		System.out.println("평점: " + score);
	}
}

public class MovieTest {
	
	public static void main(String[] args) {
		
		Movie movie = new Movie();
		//Scanner sc = new Scanner(System.in);
		
/*
 * 		System.out.print("제목: ");
		movie.name = sc.nextLine();
		System.out.print("감독: ");
		movie.direc = sc.nextLine();
		System.out.print("개봉: ");
		movie.rel = sc.nextLine();
		System.out.print("평점: ");
		movie.score = sc.nextDouble();
 */
		movie.name = "컴퓨터";
		movie.direc = "윈도우";
		movie.rel = "123123";
		movie.score = 12.3;
		
		movie.print();
	}
}
