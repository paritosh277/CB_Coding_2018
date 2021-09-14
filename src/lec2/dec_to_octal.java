package lec2;

import java.util.Scanner;

public class dec_to_octal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rem, ans = 0, mul = 1;
		while(n>0) {
			rem = n%8;
			ans = ans + rem * mul;
			mul = mul * 10;
			n = n/8;
		}
		
		System.out.println(ans);


	}

}
