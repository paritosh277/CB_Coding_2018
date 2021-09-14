package hackerblockss;

import java.util.ArrayList;
import java.util.Scanner;

public class rotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> ans= new ArrayList<>();
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
//		int[][] arr2 = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
		//Transpose
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		System.out.println("*********");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("**********");
		//Reverse each col of each matrix for rotating the matrix 90 degree anticlockwise
		
		for(int j=0; j<n; j++) {
			for(int i=0; i<n/2; i++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n-1-i][j];
				arr[n-1-i][j]=temp;
			}
		}
		
		
		
		
		
		
//		for(int i=0; i<n; i++) {
//			for(int j=n-1; j>=0; j--) {
//				ans.add(arr[i][j]);
//			}
//		}
//		
//		int noe=n*n;
//		int x=0;
//		while(x<noe) {
//			for(int j=0; j<n ;j++) {
//				for(int i =0; i<n; i++) {
//					arr2[i][j]=ans.get(x);
//					x++;
//				}
//			}
//		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
