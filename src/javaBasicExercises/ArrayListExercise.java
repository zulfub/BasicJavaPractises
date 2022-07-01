package javaBasicExercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
	//input is [1,2,3,4,5] then the output is [5,4,3,2,1]
	public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>();
	
	for(int i=0;i<=5;i++)
		numbers.add(i);
	
	System.out.println(numbers);
}
	
}
