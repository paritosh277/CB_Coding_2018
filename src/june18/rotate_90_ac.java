package june18;

import java.util.Scanner;

public class rotate_90_ac {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row=0,col=0;
		
		int[][] arr= new int[n][n];
		
		for(row=0; row<arr.length; row++) {
			for(col=0; col< arr[0].length; col++) {
				arr[row][col]= scn.nextInt();
			}
		}
		
		
		
		for(col=n-1;col>=0;col--) {
			for(row=0;row<n;row++) {
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
