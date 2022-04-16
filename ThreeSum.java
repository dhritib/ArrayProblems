package com.arrays;

import java.util.HashMap;

public class ThreeSum {
	public static void main(String args[]) {
		int a[]= {2,4,6,7,8,1,5};
		int target=13;
		int n=a.length;
		int result[]=new int[3];

		for(int i=0;i<n-1;i++){ 
			for(int j=1;j<n;j++) {
				for(int k=2;k<n;k++) {
					if(a[i]+a[j]+a[k]==target) {
						result[0]=i; result[1]=j; result[2]=k; 
					} 
				} 
			} 
		}
		for(int x=0;x<3;x++) { System.out.println(result[x]); }

		//Optimised
		HashMap<Integer,Integer> hm=new HashMap();
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n;j++) {
				int remaining=target-a[i]-a[j];
				if(hm.containsKey(remaining)) {
					result[0]=i;
					result[1]=j;
					result[2]=hm.get(remaining);
				}
				hm.put(a[j],j);
			}
		}
		for(int x=0;x<3;x++) {System.out.println(result[x]);}
	}

}
