import java.util.Scanner;

public class ArrayRead_Write {

	public static void main(String[] args) {
		int [] number = new int [10];
		
		System.out.println("Array/number length :" + number.length);
		Scanner sc = new Scanner(System.in);
		  for (int i = 0 ; i < number.length ; i++) {
			  
			 System.out.println("Enter the number " +(i + 1) + ":"); 
			 int input = sc.nextInt();
			 //i [0] = 
			  number [i] = input;
		  }
		 // System.out.println(number[]);
		  for (int i = 0 ; i < number.length ; i++) {
			  System.out.println(number[i]);
		  }
		
		 System.out.println("End");
		 
		 
		

	}

}
