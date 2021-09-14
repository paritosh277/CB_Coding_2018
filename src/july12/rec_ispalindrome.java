package july12;

import java.util.Scanner;

public class rec_ispalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println(isPalindrome(arr,0,n-1));

	}
	
	public static boolean isPalindrome(int arr[], int l, int n) {
		if(l>n || l==n) {
			return true;
		}
		
		if(l<n && (arr[l]!=arr[n]))
			return false;
		
		
		return isPalindrome(arr,l+1,n-1);
		
	}

}
