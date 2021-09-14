package array_i_deserve;

import java.util.Scanner;

public class maximum_size_square_matrix_with_all_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		
		int[][] mat = new int[row][col];
		int[][] tab = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				mat[i][j]=scn.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(i==0||j==0) {
					tab[i][j]=mat[i][j];
				}else if(mat[i][j]==0) {
					tab[i][j]=0;
				}else {
//					tab[i][j] = Math.min(mat[i][j-1], Math.min(mat[i-1][j-1], mat[i-1][j]))+1;
					
					int min=Math.min(tab[i][j-1], tab[i-1][j-1]);
					tab[i][j]=1+Math.min(min, tab[i-1][j]);
				}
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(tab[i][j]+" ");
				if(max<tab[i][j]) {
					max=tab[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println(max);

	}

}
