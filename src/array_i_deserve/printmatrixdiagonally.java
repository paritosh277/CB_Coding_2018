package array_i_deserve;

import java.util.Scanner;

public class printmatrixdiagonally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = scn.nextInt();
		System.out.println("Enter cols");
		int col = scn.nextInt();
		
		int[][] mat = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				mat[i][j] = scn.nextInt();
			}
		}
		
		for(int k=0; k<=row-1; k++) {
			int i=k;
			int j=0;
			while(i>=0) {
				System.out.print(mat[i][j]+" ");
				i--;
				j++;
			}
			System.out.println();
		}
		
		for(int k=1; k<=col-1; k++) {
			int i=row-1;
			int j=k;
			while(j<=col-1) {
				System.out.print(mat[i][j]+ " ");
				i--;
				j++;
			}
			System.out.println();
		}
	}

}
