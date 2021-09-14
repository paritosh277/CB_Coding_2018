package hackerblockss;

import java.util.Scanner;

public class matrixSearch {
	
	public static int matsearch(int[][] arr, int target) {
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				if(target == arr[i][j]) {
//					return 1;
//				}
//			}
//		}
//		return 0;
		
		int row = 0;
		int col = arr[row].length-1;
		
		while(row<arr.length && col>=0) {
			if(target == arr[row][col]) {
				return 1;
			}else if(target > arr[row][col]) {
				row++;
			}else{
				col--;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
		int target = scn.nextInt();
		
		System.out.println(matsearch(arr, target));
		
//		int row = 0;
//		int col = arr[row].length-1;
//		
//		while(row<arr.length && col>=0) {
//			if(target == arr[row][col]) {
//				System.out.println("1");
//				break;
//			}else if(target > arr[row][col]) {
//				row++;
//			}else if(target < arr[row][col]) {
//				col--;
//			}else {
//				System.out.println("0");
//			}
//		}
		
		

	}

}
