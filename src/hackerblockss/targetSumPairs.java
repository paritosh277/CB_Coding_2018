package hackerblockss;

import java.util.Arrays;
import java.util.Scanner;

public class targetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		int target = scn.nextInt();
		for(int j=0; j<arr.length-1;j++) {
			for(int k=j+1; k<arr.length; k++) {
				if((arr[j]+arr[k]) == target){
					System.out.println(arr[j] + " and " + arr[k]);
				}
			}
		}

	}

}
