package lec2;

import java.util.Scanner;

public class hollow_diamond_pattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i,j,k;
		for(i=1;i<=1+n/2;i++) {
			for(j=1+n/2;j>=i;j--) {
				System.out.print("*\t");
			}
			
			for(k=1;k<i;k++) {
				System.out.print("\t");
			}
			
			for(l=1;)
			System.out.println();
		}

	}

}
