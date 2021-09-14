package hackerblockss;

import java.util.Scanner;

public class fibonacciUsingRecurssion {
	
	
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		
		int ans = fibonacci(n-1) + fibonacci(n-2);
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = fibonacci(n);
		System.out.println(ans);

	}

}
