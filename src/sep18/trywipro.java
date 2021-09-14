package sep18;

import java.util.Scanner;

public class trywipro {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];
		
		System.out.println("Enter values for 1st matrix");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				a[i][j]=scn.nextInt();
			}
		}
		
		System.out.println("Enter values for 2nd matrix");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				b[i][j]=scn.nextInt();
			}
		}
		
		int result = checkMatrices(a,b);
		if(result==1) {
			System.out.println("Matrices are equal");
		}else {
			System.out.println("Matrices are not equal");
		}

	}
	
	public static int checkMatrices(int a[][], int b[][] ) {
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[0].length; j++) {
				if(a[i][j]!=b[i][j]) {
					return 0;
				}
			}
		}
		return 1;
	}

}
