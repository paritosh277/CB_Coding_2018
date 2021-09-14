package lec2;

import java.util.Scanner;

public class binary_to_deci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rem, ans = 0, mul = 1;
		while(n>0) {
			rem = n%10;
			ans = ans + rem * mul;
			mul = mul * 2;
			n = n/10;
		}
		
		System.out.println(ans);

	}

}
