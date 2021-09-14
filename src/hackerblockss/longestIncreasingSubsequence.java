package hackerblockss;

import java.util.Scanner;

public class longestIncreasingSubsequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = {50,3,10,7,40,80};
		int T[] = {1,1,1,1,1,1};
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i]) {
					T[i]= Math.max(T[i],T[j]+1);
				}
			}
		}
		
		int  max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(T[i]>max) {
				max=T[i];
			}
		}
		
		System.out.println(max);
		
//		System.out.println(T[arr.length-1]);
		
//		 int n = scn.nextInt();
//	     int[] arr = new int[n];
//
//	     for(int i=0; i<n; i++){
//	           arr[i]=scn.nextInt();
//	     }

	}

}
