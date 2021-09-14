package hackerblockss;

import java.util.Scanner;

public class recursionFirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,10,8};
		Scanner scn = new Scanner(System.in);
		int find = scn.nextInt();
		int len = arr.length;
		System.out.println(findFirstIndex(arr, find, 0, len));

	}
	
	public static int findFirstIndex(int[] arr, int find, int idx, int len) {
		if(idx==len) { 
			return -1;
		}
		
		if(arr[idx]==find) {
			return idx;
		}
		
		return findFirstIndex(arr, find, idx+1, len);
	}

}
