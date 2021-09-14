package june18;

import java.util.Scanner;

public class array_reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		reverse(arr);
	}
	
	public static void reverse(int arr[]) {
		int start=0, end =arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
		
	
	
}
