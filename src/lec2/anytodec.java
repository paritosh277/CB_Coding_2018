package lec2;

import java.util.Scanner;

public class anytodec {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sb = scn.nextInt();
		int mul=1,ans=0,rem;
		while(n>0) {
			rem = n % 10;
			ans = ans + (rem * mul);
			mul = mul * sb;
			n=n/10;
		}
		System.out.println(ans);
	}

}
