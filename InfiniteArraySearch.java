package com.arrays;

public class InfiniteArraySearch {
	public static void main(String args[]) {
		int a[]= {1,3,7,8,12,31,44,58,79, 88, 110};
		int target=58;
		
		int low=0;
		int high=1;
		while(a[high]<target) {
			low=high;
			high=2*high;
		}
		int i=binarySearch(a,target,high,low);
		System.out.println(i) ;
	}
	
	public static int binarySearch(int [ ]a, int target, int high, int low) {
		int pos=0;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(a[mid]==target) {
				pos= mid;
				return pos;
			}
			else if(a[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return pos;
	}
}
