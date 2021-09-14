package hackerblockss;

import java.util.Scanner;

public class piyushAndMagicalPark {
	
	public static void escape(char[][] mat, int n, int m, int k, int s) {
//		boolean status = true;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(s<k) {
						System.out.println("No");
						System.out.println(s);
						return;
				}
					
				if(mat[i][j] == '.') {
						s=s-2;
				}else if(mat[i][j] == '*') {
						s=s+5;
				}else {
						break;
				}
					
				if(j!=2) {
						s--;
				}
			}
		}
		
		System.out.println("yes");
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k = scn.nextInt();
		int s = scn.nextInt();
//		boolean status = true;
		
		char[][] mat = new char[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				mat[i][j] = scn.next().charAt(0);
			}
		}
		
		escape(mat, n, m, k, s);
		
	
		

	}

}
