package july12;

import java.util.Scanner;

public class recursion_all_indices_prob {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		int z=0;
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int key = scn.nextInt();
		int[] ans = checkarrkey(arr, arr1, key,n,z);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}
	
	public static int[] checkarrkey(int[] arr, int arr1[], int key, int n, int z) {
		if(n==0) {
			return arr1;
		}
		
		if(key==arr[n-1]) {
			arr1[z++]=n-1;
		}
		
		return checkarrkey(arr,arr1,key,n-1,z);
	}


}
