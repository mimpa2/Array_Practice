import java.util.Scanner;
public class ArrayStore {

	public static void main(String[] args) {
	int [] array = new int [5];
	
	System.out.println("Array size : " + array.length);
	
	
	for (int i = 0 ; i <array.length ; i++) {
		System.out.println("Enter array " + (i+1) + ":");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		array[i] = input ;
		
		
	}
	for (int i = 0 ; i < array.length ; i++) {
		System.out.println("Array " +(i + 1)+ ":" +array[i]);
		
	}
	
		System.out.println("****END****");
	
	}

}

















