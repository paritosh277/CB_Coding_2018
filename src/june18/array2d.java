package june18;

import java.util.Scanner;

public class array2d {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[][]=takeInput();
		display(arr);

	}
	
	public static int[][] takeInput(){
		System.out.println("Rows?");
		int rows=scn.nextInt();
		int [][]arr = new int[rows][];
		
		for(int row=0; row<arr.length; row++) {
			System.out.println("Cols for row- " +row+" ?" );
			int cols=scn.nextInt();
			arr[row] = new int[cols];
		}
		
		//refill
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.println("[" + row + "-" + col+ "]" + " " +"?" );
				
				arr[row][col]= scn.nextInt();
			}
		}
		return arr;
		
		
	}
	
	public static void display(int[][] arr ) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println( );
		}
	}
}
