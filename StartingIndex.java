package com.arrays;

public class StartingIndex {
		//what number to add at beginning so that total sum is positive
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,1,-4,2,6,-15,-2,1,8,12};
		//2+7+2
		//2+1+(x=2)-4=1
		//1+2+6+(x=7)-15=1
		//1-2+(x=2)=1
		int result=0;
		int curSum=0;
		for(int i=0;i<arr.length;i++) {			
				curSum=curSum+arr[i];
				if(curSum<1) {
					result+=1-curSum;
					curSum=1;					
				}
				
		}
		System.out.println(result);	
		
	}

}
