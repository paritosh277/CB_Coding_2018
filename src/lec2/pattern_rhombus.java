package lec2;

import java.util.Scanner;

public class pattern_rhombus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int i,j,k,l=1,m,p=1,x=1;
		
		//upper
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print("\t");
			}
			 l=i;
			for(k=1; k<=i; k++) {
				System.out.print(l++ + "\t");
			}
			p=l-2;
			for(m=k-2;m>=1;m--) {
				System.out.print(p-- +"\t");
			}
			
			System.out.println("");
		}
		
		//lower
		
		for(i=1;i<=n-1;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("\t");
			}
			for(k=n-1;k<=n;k++) {
				System.out.print(k+"\t");
			}
		}
		

	}

}
