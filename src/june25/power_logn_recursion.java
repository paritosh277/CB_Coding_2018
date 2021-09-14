package june25;

import java.util.Scanner;

public class power_logn_recursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(power(x,n));

	}
	
	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		
		int sp = power(x,n/2);
		int res;
		
		if(n%2 == 0) {
			res = sp *sp;
		}else {
			res = x*sp*sp;
		}
		
		return res;
	}

}
