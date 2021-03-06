package javaBasicExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Integer Reversion : 1");
		System.out.println("Ducth Flag Problem: 2");
		System.out.println("Trapped Water Problem: 3");
		System.out.println("PalindromeProblem: 4");
		System.out.println("LinkedList Practice: 5");
		System.out.println("Doubly LinkedList Practice: 6");
		System.out.println("Compare Data Structures: 7");
		System.out.println("Find the Middle Node of Linked List: 8");
		System.out.println("Reverse A LinkedList: 9");
		System.out.println("Stack Operations: 10");
		System.out.println("Stack of Arrays : 11");
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
				LinkedListMod<String> names = new LinkedListMod<>();
				System.out.println("Write the names to added to List :::");	
				String n2 = scan.next();
				names.insert(n2);
				names.insert(n2+"1");
				names.insert(n2+"2");
				names.insert(n2+"3");
				names.insert(n2+"4");
				names.traverse();
				
				names.remove(n2+"3");
				names.traverse();
				
				LinkedListMod<Person> people = new LinkedListMod<>();
				System.out.println("Comparing The People");
				Person p = new Person(23 , "Skuld");
				people.insert(p);
				people.insert(new Person (23,n2));
				people.insert(new Person (28,n2+"2"));
				people.insert(new Person (32,n2+"3"));
				people.traverse();
				
				people.remove(p);
				people.traverse();
			break;
			case 6:
				System.out.println("Doubly Linked List");
				DoublyLinkedListMod<String> peobleName= new DoublyLinkedListMod<>();
				peobleName.insert("Ali");
				peobleName.insert("Adam");
				peobleName.insert("Skuld");
				System.out.println("Print Forwarded :::");
				peobleName.traversFoward(null);
				System.out.println("Print Backwarded :::");
				peobleName.traversBackward(null);
			break;
			case 7:
				System.out.println("Compare of Data Structures");
				System.out.println("Give the number of item should inserted :::");
				int it1 = scan.nextInt();
				ArrayList<Integer> arr = new ArrayList<>();
				long startTime = System.currentTimeMillis();
				
				for (int i=0;i<=it1;i++) {
					arr.add(i);
				}
				System.out.println("Elapse Time For ArrayList ::" + (System.currentTimeMillis() - startTime));
				
				LinkedListMod<Integer> lnklst = new LinkedListMod<>();
				startTime = System.currentTimeMillis();
				for(int i=0;i<=it1;i++) {
					lnklst.insert(i);
				}
				System.out.println("Elapse Time for LinkedList::" +(System.currentTimeMillis()-startTime));
				DoublyLinkedListMod<Integer> doubLnkLst = new DoublyLinkedListMod<>();
				startTime = System.currentTimeMillis();
				for(int i=0;i<=it1;i++) {
					doubLnkLst.insert(i);
				}
				System.out.println("Elapse Time for Double LinkedList::" +(System.currentTimeMillis()-startTime));
			break;
			case 8:
				System.out.println("Finding the middle Node"); 
				LinkedListMod<Person> people1 = new LinkedListMod<>();
				people1.insert(new Person(1,"Skuld"));
				people1.insert(new Person(2,"Ali"));
				people1.insert(new Person(3,"Veli"));
				people1.insert(new Person(4,"Cengiz"));
				people1.insert(new Person(5,"Ahmet"));
				people1.insert(new Person(6,"Sakir"));
				people1.insert(new Person(7,"Yasar"));
				people1.insert(new Person(8,"Osman"));
				people1.insert(new Person(9,"Muray"));
				people1.insert(new Person(10,"Mahmut"));
				people1.insert(new Person(11,"Kamil"));
				System.out.println(people1.getMiddleNode());
			break;
			case 9:
				System.out.println("Reverse A LinkedList");
				LinkedListMod<Integer> linkListRev = new LinkedListMod<>();
				linkListRev.insert(10);
				linkListRev.insert(2);
				linkListRev.insert(13);
				linkListRev.insert(5);
				linkListRev.traverse();
				
				linkListRev.reverse();
			break;
			case 10:
				System.out.println("Stack Initilazition");
				Stack<String> namess = new Stack<>();
				namess.push("Skuld");
				namess.push("Zulfu");
				namess.push("Baris");
				namess.push("Ege");
				while (!namess.isEmpty()) {
					System.out.println(namess.pop());
				}
			break;
			case 11:
				System.out.println("Stack of Arrays ");
				System.out.println("Give an UpperLimit for elements of Stack ::");
				StackWithArrays<Integer> listOfNums = new StackWithArrays<>();
				Random rand = new Random();
				int upprLimit = scan.nextInt();
				for(int i=1;i<upprLimit;i++) {
					
					listOfNums.push(rand.nextInt(i));
				}
				while(!listOfNums.isEmpty()) {
					System.out.print(listOfNums.pop()+ " ");
				}
			break;	
		}
		
	}
}
