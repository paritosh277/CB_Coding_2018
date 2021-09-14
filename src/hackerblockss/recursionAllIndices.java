package hackerblockss;

import java.util.Scanner;

public class recursionAllIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int arr[] = {9,8,10,8,8};
		int x = scn.nextInt();
		findIndices(arr, 0, x);

	}
	
	public static void findIndices(int[] arr, int n, int x) {
		if(n==arr.length) {
			return;
		}
		
		if(arr[n] == x) {
			System.out.print(n+" ");
		}
		
		findIndices(arr, n+1, x);
	}

}
