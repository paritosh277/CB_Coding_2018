package algorithmsHackerBlocksPracticeProblems;

import java.util.Scanner;

public class manmohanLovesPatternII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=1;
		for(int i=0; i<n; i++) {
			if(i==0) {
				System.out.print(a);
			}else {
				for(int j=0; j<=i;j++) {
					if(j==0 || j==i) {
						System.out.print(a);
					}else {
						System.out.print(0);
					}
				}
				a++;
			}
			System.out.println();
			
		}

	}

}
