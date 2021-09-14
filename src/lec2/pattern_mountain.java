package lec2;

import java.util.Scanner;

public class pattern_mountain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i,j,k,l,m;
		for(i=1;i<=n;i++) {							//rows
			for(j=1;j<=i;j++) {						//no.s
				System.out.print(j + "\t");
			}
			
			for(k=i;k<n;k++) {						//spaces of lhs
				System.out.print("\t");
			}
			
			for(l=n-2;l>=i;l--) {					//spaces of rhs
				System.out.print("\t");
			}
			
			for(m=i;m>=1;m--) {						//no.s
				
				if(m==n) {
					System.out.print(m-1 + "\t");
					m--;
				}
				else {
					System.out.print(m + "\t");
				}
			}
			System.out.println("");
		}

	}

}
