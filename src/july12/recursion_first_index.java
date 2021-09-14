package july12;

import java.util.Scanner;

public class recursion_first_index {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int m = scn.nextInt();
		
		System.out.println(firstIndex(arr,m,0,n));

	}
	
	public static int firstIndex(int[] arr, int m, int l, int n) {
		if(l==n) {
			return -1;
		}
		
		if(m==arr[l]) {
			return l;
		}
		
		return firstIndex(arr, m, l+1, n);
	}

}
