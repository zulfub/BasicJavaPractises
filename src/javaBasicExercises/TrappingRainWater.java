package javaBasicExercises;

public class TrappingRainWater {
	private int[] height;
	public TrappingRainWater(int[]height) {
		this.height = height;
	}

	public int solve() {
		//Trapped water capacity parameter
		int trapWater = 0;
		//less than 3 bars can not trap any water
		if(height.length<3) {
			return 0;
		}
		//create arrays for max left and right 
		int[] leftMax = new int [height.length];
		int[] rightMax = new int [height.length];
		//calculating the left max values 
		//first item of leftMax should be 0
		leftMax[0]=0;
		for(int i=1;i<leftMax.length;i++) {
			leftMax[i] = Math.max(leftMax[i-1],height[i-1]);
		}
		//last item of rightMax should be 0
		rightMax[height.length-1]=0;
		for(int j=height.length-2;j>0;j--) {
			rightMax[j] = Math.max(rightMax[j+1],height[j+1]);
		}
		for(int i=1;i<height.length-1;i++) {
			if(Math.min(leftMax[i],rightMax[i])>height[i]) {
				trapWater += Math.min(leftMax[i],rightMax[i])-height[i];
			}
		}
		return trapWater;
	}
	
}
