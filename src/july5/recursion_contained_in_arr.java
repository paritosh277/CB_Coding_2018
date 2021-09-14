package july5;

import java.util.Scanner;

public class recursion_contained_in_arr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int key = scn.nextInt();
		System.out.println(checkarrkey(arr,key,n));
	}
	
	public static boolean checkarrkey(int[] arr, int key, int n) {
		if(n==0) {
			return false;
		}
		
		if(key==arr[n-1]) {
			return true;
		}
		
		return checkarrkey(arr,key,n-1);
	}

}
