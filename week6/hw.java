package week6;

public class hw {
	
	public static void main(String[] args) {

		int [] arr = new int[10];		
		
		int min = 100, max = 0;

		for(int a = 0; a < 10; a++) {
			
			arr[a] = (int)(Math.random()*100);
			
			if(max <= arr[a])
				max = arr[a];
			
			if(min >= arr[a])
				min = arr[a];
			
			System.out.print(arr[a] + " ");			
		}		
		
		System.out.print("\nÃÖ´ñ°ª: " + max);
		System.out.print("\nÃÖ¼Ú°ª: " + min);
	
	}
}
