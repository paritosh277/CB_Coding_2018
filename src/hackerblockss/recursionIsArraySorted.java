package hackerblockss;

import java.util.Scanner;

public class recursionIsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]= {11,22,44,55,66};
		System.out.println(isSorted(arr, arr.length));
	}
	
	public static boolean isSorted(int[] arr, int n) {
		if(n==0||n==1) {
			return true;
		}
		
		if(arr[n-1]<arr[n-2]) {
			return false;
		}
		
		return isSorted(arr, n-1);
	}

}
