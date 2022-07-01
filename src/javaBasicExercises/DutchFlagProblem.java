package javaBasicExercises;

import java.util.Arrays;

public class DutchFlagProblem {
	//Array of 0s , 1s , 2s
	private int[] nums;

	public DutchFlagProblem(int[] nums) {
		this.nums = nums;
	}	
	
	public void solve() {
		int i =0;
		int j =0;
		int pivot = 1;
		int k =nums.length-1;
		
		while(j<=k) {
			//when item j is 2
			if(nums[j] > pivot) {
				arraySwap(k,j);
				k--;
			}
			//when item j is 0
			else if(nums[j] < pivot) {
				arraySwap(i,j);
				j++;
				i++;
			}
			//when item j is 1
			else {
				j++;
			}
				
		}
	}	
	private void arraySwap(int index1 , int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
	public void showResult() {
		System.out.println(Arrays.toString(nums));
	}
}
