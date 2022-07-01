package javaBasicExercises;

import java.util.Arrays;

public class ArrayExercise {

	public static void main(String[] args) {
	
		
		//Array Reversing Operation Test 
		int[] nums = {1,2,3,4,5,6,7};
		
		ArrayExercise problem = new ArrayExercise();	
		
		System.out.println(Arrays.toString(problem.solve(nums)));
		
		
}
	//no need for extra memory
	public int[] solve(int[]nums) {
		int lowIndex = 0;
		int highIndex = nums.length-1;
		
		while (lowIndex< highIndex) {
			swap(nums,lowIndex , highIndex);
			lowIndex++;
			highIndex--;
		}	
		
		return nums;
	}

	private void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
