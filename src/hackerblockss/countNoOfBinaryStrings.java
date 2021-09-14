package hackerblockss;

import java.util.Scanner;

public class countNoOfBinaryStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		while(n>0) {
			int t1 = 1;
			int t2 = 1;
			int sum=0;
			
			int limit = scn.nextInt();
			
			for(int i=1; i<=limit; i++) {
				sum=t1+t2;
				t1=t2;
				t2=sum;
			}
			
			System.out.println(sum);
			n--;
		}

	}

}
