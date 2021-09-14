package Practice_DS;

import java.util.Scanner;

public class two_d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[3][];
		for(int row=0; row<arr.length; row++) {
			System.out.println("Enter the number of columns for row " + row);
			int col = scn.nextInt();
			arr[row] = new int[col];
		}
		
		//input
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.println("Enter the value of row "+row+ "and col "+col);
				arr[row][col]=scn.nextInt();
			}
		}
		
		//display
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println();
		}

	}

}
