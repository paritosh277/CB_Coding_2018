package hackerblockss;

import java.util.Scanner;

public class subsetSumProblem {
	
	public static boolean subset(int[] arr, int target) {
		boolean[][] dp = new boolean[arr.length+1][target+1];
		
		dp[0][0]=true; //If sum is zero and no element is taken ans is true
		for(int i=1; i<=arr.length;i++) { // If sum is zero ans is always true
			dp[i][0]=true;
		}
		
		for(int j=1; j<=target; j++) { // If no element is chosen and sum is not zero ans is false
			dp[0][j]=false;
		}
		
		
		for(int i=1; i<=arr.length; i++) {
			for(int j=1; j<=target; j++) {
				if(arr[i-1]>j) {
					dp[i][j]=dp[i-1][j];
				}else {
					dp[i][j]=(dp[i-1][j] || dp[i-1][j-arr[i-1]]);
				}
			}
		}
		
		return dp[arr.length][target];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		System.out.println("Enter the target");
		int target = scn.nextInt();
		System.out.println(subset(arr, target));
		
		
//		 int n = scn.nextInt();
//	     int[] arr = new int[n];
//
//	     for(int i=0; i<n; i++){
//	           arr[i]=scn.nextInt();
//	     }
//
//	        
//	     // int arr[] = {2,3,7,8,10};
//	     // System.out.println("Enter the target");
//	     int target = scn.nextInt();
//	     System.out.println(subset(arr, target));

	}

}
