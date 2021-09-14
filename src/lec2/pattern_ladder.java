package lec2;

import java.util.Scanner;

public class pattern_ladder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i , j,k=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(k++ + "\t");
			}
			System.out.println();
		}

	}

}
