package lec2;

import java.util.Scanner;

public class any_to_any {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int n = scn.nextInt();
		int rem, ans=0, ans2=0, mul1=1, mul2=1;
		while(n>0) {
			rem = n%10;
			ans = ans + rem * mul1;
			mul1 = mul1 * sb;
			n=n/10;
		}
		
		n=ans;
		if(db!=10) {
			while(n>0) {
				rem = n%db;
				ans2 = ans2 + rem * mul2;
				mul2 = mul2 * 10;
				n=n/db;
			}
		}
		
		System.out.println(ans2);

	}

}
