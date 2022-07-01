package javaBasicExercises;

import java.util.Arrays;

public class AnagramProblem {
//Interview Question	
//Checking for 2 word for wether they are anagram or not
	public static void main(String[] args) {
		AnagramProblem problem = new AnagramProblem();
		
		System.out.println("These are anagram :::" + problem.solve("uldks".toCharArray(), "skuld".toCharArray()));
	}
	public boolean solve(char[]s1 , char[]s2) {
		
		if(s1.length != s2.length) return false;
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i=0;i<s1.length;i++) {
			if(s1[i] != s2[i]) return false;
		}
		return true;
	}
	
}
