package hackerblockss;

import java.util.Scanner;

public class recursionLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,10,8,8,9};
		Scanner scn = new Scanner(System.in);
		int find = scn.nextInt();
		int len = arr.length;
		System.out.println(findLastIndex(arr, find, len-1, len));

	}
	
	public static int findLastIndex(int[] arr, int find, int idx, int len) {
		if(idx<0) { 
			return -1;
		}
		
		if(arr[idx]==find) {
			return idx;
		}
		
		return findLastIndex(arr, find, idx-1, len);
	}

}
