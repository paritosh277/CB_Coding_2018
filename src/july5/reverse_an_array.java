package july5;

import java.util.Scanner;

public class reverse_an_array {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		reverse(arr, arr.length-1);
	}
	
	public static void reverse(int[] arr, int n) {
		if(n<0) {
			return;
		}
		
		System.out.println(arr[n]);
		reverse(arr,n-1);
	}

}
