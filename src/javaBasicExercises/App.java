package javaBasicExercises;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Integer Reversion : 1");
		System.out.println("Ducth Flag Problem: 2");
		System.out.println("Trapped Water Problem: 3");
		System.out.println("PalindromeProblem: 4");
		//Scanning Int from keyboard for operation
		Scanner scan = new Scanner(System.in);			
		int n = scan.nextInt();
		switch(n) { 
			case 1:		
				//Integer Reversion Problem
				System.out.println("Type the Integer which be reversed :::");	
				int n1 = scan.nextInt();
				scan.close();
				System.out.println("Orjinal int :::"+n1);
				//Making operation with instance creation
				IntegerReversion problem = new IntegerReversion();		
				System.out.println("Reversed int :::" +problem.reverseN(n1));
			break;
			case 2:
				//Ducth Flag Problem 
				int nums[]= {1,2,2,1,2,0,2,2,1,0,0,0,1,2,1};
				//Instance of DucthFlagProblem class
				DutchFlagProblem problem2 = new DutchFlagProblem(nums);
				//print orjinal array
				System.out.println("Orjinal Array :");
				problem2.showResult();
				//sorting array
				problem2.solve();
				//Print array
				System.out.println("Sorted Array :");
				problem2.showResult();
			break;
			case 3:
				//Trapped Water Problem
				int[] levels = {4,1,3,1,5};
				System.out.println("Trapped Water Level Problem");
				TrappingRainWater problem3 = new TrappingRainWater(levels);
				int trappedWater = problem3.solve();
				System.out.println("Trapped Water in given levels : " + trappedWater);
			break;
			case 4:
				System.out.println("Palindrome Problem");
				PalindromeProblem.main(null);
			break;
			case 5:
				System.out.println("Doubly Linked List");
				DoublyLinkedList<String> peobleName= new DoublyLinkedList<>();
				peobleName.insert("Ali");
				peobleName.insert("Adam");
				
		}
		
	}
}
