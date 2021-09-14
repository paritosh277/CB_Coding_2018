package lec2;

import java.util.Scanner;

public class dectoany {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int db = scn.nextInt();
		int mul=1,ans=0,rem;
		while(n>0) {
			rem = n % db;
			ans = ans + (rem * mul);
			mul = mul * 10;
			n=n/db;
		}
		System.out.println(ans);

	}

}
