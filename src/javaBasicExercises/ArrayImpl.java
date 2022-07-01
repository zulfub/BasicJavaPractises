package javaBasicExercises;

public class ArrayImpl {
//Array implementation Example
	public static void main(String[] args) {
		//arrays are not dynamic data structures
		int[] nums = new int[101];
		for(int i=0;i<=100;i++)
			nums[i]=i;		
		nums[0]=100;
		nums[100]=0;
		for(int i=0;i<=99;i++)
			System.out.println(nums[i]);
	}
}
