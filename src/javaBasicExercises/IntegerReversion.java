package javaBasicExercises;

import java.util.Scanner;

public class IntegerReversion {

	public static void main(String[] args) {
		//Scanning Int from keyboard
		Scanner scan = new Scanner(System.in);			
		int n = scan.nextInt();
		scan.close();
		System.out.println("Orjinal int :::"+n);
		//Making Same operation with Static method
		int a = reverse(n);
		System.out.println("Reversed int :::"+a);
		//Making Same operation with instance creation
		IntegerReversion problem = new IntegerReversion();		
		System.out.println("Reversed int :::" +problem.reverseN(n));
	}
	
	public static int reverse(int n) {
		int reversed = 0;
		int remainder = 0;
		
		while (n>0) {
			//Remainder is last digit
			remainder = n%10;
			//Split integer with division
			n=n/10;			
			reversed = reversed *10 + remainder;
		}
		return reversed;
	}
	
	
	public int reverseN(int n) {
		int reversed = 0;
		int remainder = 0;
		
		while (n>0) {
			remainder = n%10;
			n=n/10;
			reversed = reversed *10 + remainder;
		}
		return reversed;
	}
	
}
 