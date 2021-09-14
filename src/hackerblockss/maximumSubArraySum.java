package hackerblockss;

import java.util.Scanner;

public class maximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//KADANE'S ALGORITHM
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=scn.nextInt();
			}
			int sum=0;
			int ans=0;
			for(int i=0; i<n; i++) {
				sum=sum+arr[i];
				if(ans<sum) {
					ans=sum;
				}
				
				if(sum<0) {
					sum=0;
				}
			}
			System.out.println(ans);
			t--;
		}

	}

}
