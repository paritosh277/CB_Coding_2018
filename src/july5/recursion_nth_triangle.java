package july5;

import java.util.Scanner;

public class recursion_nth_triangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(triangle(n));
	}
	
	public static int triangle(int n) {
		if(n==1) {
			return 1;
		}
		
		n=n + triangle(n-1);
		return n;
	}

}
