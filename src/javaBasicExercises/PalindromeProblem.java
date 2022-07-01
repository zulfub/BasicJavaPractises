package javaBasicExercises;

import java.util.Arrays;

public class PalindromeProblem {
	//Checking for A word's which is reverse of word same with it self or not
	public static void main(String[] args) {
		PalindromeProblem problem = new PalindromeProblem();
		System.out.println("Given String ::: " + "akaka" + " is it Palindrome");
		System.out.println(problem.solve("akaka"));
		
}
	private boolean solve(String word) {
		int lowIndex = 0;
		int highIndex= word.length()-1;
		
		while (lowIndex<highIndex) {
			if(word.charAt(lowIndex)!=word.charAt(highIndex)) return false;
			lowIndex++;
			highIndex--;
		}
			
		return true;
	}	

	
}
