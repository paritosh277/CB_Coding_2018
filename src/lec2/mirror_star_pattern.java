package lec2;

import java.util.Scanner;

public class mirror_star_pattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i,j,k,m;
		
		//upper
		
		for(i=1;i<=1+n/2;i++) {
			for(j=1;j<=1+n/2-i;j++) {
				System.out.print("\t");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*\t");
			}
			for(m=k-2;m>=1;m--) {
				System.out.print("*\t");
			}
			
			System.out.println();
		}
		
		//lower
		for(i=1;i<=n/2;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("\t");
			}
			for(k=1;k<=n/2+1-i;k++) {
				System.out.print("*\t");
			}
			for(m=k-2;m>=1;m--) {
				System.out.print("*\t");
			}
			
			
			
			System.out.println();
			
		}
		
		

	}

}
