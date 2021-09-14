package hackerblockss;

import java.util.Scanner;

public class maximumLengthBiotonicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			int[] t1arr = new int[n];
			int[] t2arr = new int[n];
			int[] t3arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=scn.nextInt();
				t1arr[i]=1;
				t2arr[i]=1;
			}
			
			for(int i=1; i<arr.length;i++) {
				for(int j=0; j<i; j++) {
					if(arr[j]<arr[i]) {
						t1arr[i]=Math.max(t1arr[i], t1arr[j]+1);
					}
				}
			}
			
			for(int i=arr.length-2; i>=0;i--) {
				for(int j=arr.length-1; j>i; j--) {
					if(arr[j]<arr[i]) {
						t2arr[i]=Math.max(t2arr[i], t2arr[j]+1);
					}
				}
			}
			
			for(int i=0; i<n; i++) {
				t3arr[i]=t1arr[i]+t2arr[i]-1;
			}
			
			int  max = Integer.MIN_VALUE;
			for(int i=0; i<arr.length; i++) {
				if(t3arr[i]>max) {
					max=t3arr[i];
				}
			}
			
			System.out.println(max);
			t--;
		}

	}

}
