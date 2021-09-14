package june22;

import java.util.Scanner;

public class power_recursion {

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
		
		int pnm = power(x,n-1);
		int pn = x * pnm;
		return pn;
	}

}
