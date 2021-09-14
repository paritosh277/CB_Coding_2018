package june21;

import java.util.Scanner;

public class logfunc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int ans = logarithmic(x,n);
		System.out.println(ans);

	}
	
	public static int logarithmic(int x, int n) {
		int ans2;
		ans2=(int)(Math.log(x)/Math.log(n));
		return ans2;
	}

}
