package july5;

import java.util.Scanner;

public class recursion_check_arr_sort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(checkarrsort(arr,n));

	}
	
	public static boolean checkarrsort(int[] arr, int n) {
		if(n==0 || n==1) {
			return true;
		}
		
		if(arr[n-1]<arr[n-2]) {
			return false;
		}
		
		return checkarrsort(arr,n-1);
	}

}
