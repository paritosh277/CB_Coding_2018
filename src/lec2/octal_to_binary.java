package lec2;

import java.util.Scanner;

public class octal_to_binary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rem, ans=0, ans2=0, mul1=1, mul2=1;
		while(n>0) {
			rem=n%10;
			ans = ans + rem * mul1;
			mul1 = mul1 * 8;
			n=n/10;
		}
		
		n=ans;
		while(n>0) {
			rem = n % 2;
			ans2 = ans2 + rem * mul2;
			mul2 = mul2 * 10;
			n=n/2;
		}
		
		System.out.println(ans2);
	}

}
