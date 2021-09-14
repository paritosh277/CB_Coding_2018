package hackerblockss;

import java.util.Scanner;

public class findUpperAndLowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n ;i++) {
			arr[i]=scn.nextInt();
		}
		
		int t = scn.nextInt();
		while(t>0) {
			int find = scn.nextInt();
			upperLower(find, arr);
		}
		
	}
	
	public static void upperLower(int find, int[] arr) {
		int lower=-1;
		int upper=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(find==arr[i] && lower==-1) {
				lower=i;
				upper=i;
			}
			
			if(find==arr[i] && lower!=-1) {
				upper=i;
			}
			
		}
		
		System.out.println(lower +" "+upper);
	}

}
