package hackerblockss;

import java.util.Arrays;
import java.util.Scanner;

public class targetSumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]= scn.nextInt();
		}
		
		int target = scn.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++) {
			int left = i+1;
			int right = arr.length-1;
			while(left<right) {
				int sum = arr[i]+arr[left]+arr[right];
				
				if(sum<target) {
					left++;
				}else if(sum>target) {
					right--;
				}else {
					System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
					left++;
					right--;
				}
			}
		}
		

	}

}
