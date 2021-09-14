package sirion_labs;

import java.util.Scanner;

public class myPascalTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int row = scn.nextInt();
		int[][] arr = new int[row][row];
		int i=0,j=0;
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				if(j==0 || j==i) {
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}
		
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
