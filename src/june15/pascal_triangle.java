package june15;

import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=0,j=0,coef=1;
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				if(j==0 || j==i) {
					coef=1;
					System.out.print(coef+"\t");
				}else {
					coef=coef*(i-j+1)/j;
					System.out.print(coef+"\t");
				}
			}
			System.out.println();
		}

	}

}
