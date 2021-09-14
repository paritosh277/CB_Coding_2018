package hackerblockss;

import java.util.Scanner;

public class maxSubarrayCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n ; i++) {
				arr[i]=scn.nextInt();
			}
			
			int max_kadane = kadane(arr);
			
			int max_wrap=0;
			for(int i=0; i<n; i++) {
				max_wrap=max_wrap+arr[i];
				arr[i]=-arr[i];
			}
			
			max_wrap = max_wrap + kadane(arr);
			
			if(max_kadane>max_wrap) {
				System.out.println(max_kadane);
			}else {
				System.out.println(max_wrap);
			}
			
			t--;
		}

	}
	
	public static int kadane(int[] arr) {
		int sum=0;
		int ans=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			if(ans<sum) {
				ans=sum;
			}
			
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
