package com.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ArraySecondHighest {
	public static void main(String args[]) {
		int a[]= {6,2,1,15,22,7,9,4,25};

		int max=a[0];		
		int temp=0;
		for(int i=1;i<a.length;i++) {			
			if(a[i]>max) { 
				temp=max;  
				max =a[i]; 			
			}
		}		
		System.out.println(temp);
		//3rd or kth highest
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int n=3;
		for(int i=0;i<n;i++) {
			pq.add(a[i]);
		}
		for(int i=n;i<a.length;i++) {
			if(pq.peek()<a[i]) {
				pq.poll();
				pq.add(a[i]);
			}
			
		}
		System.out.println(pq.peek());
		
	}
	
}
