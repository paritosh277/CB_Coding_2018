package hackerblockss;

import java.util.Scanner;

public class recursionFactorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fact(n));

	}

}
