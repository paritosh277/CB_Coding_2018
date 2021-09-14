package july2;

import java.util.Scanner;

public class max_subarray_sum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			submax(arr);
			t--;
		}

	}
	
	public static void submax(int[] arr) {
		int maxsum=0;
		for(int i =0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i; j <arr.length; j++) {
				sum+=arr[j];
				if(sum>maxsum) {
					maxsum=sum;
				}
			}
			
		}
		
		System.out.println(maxsum);
	}

}
