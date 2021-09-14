package hackerblockss;

import java.util.Scanner;

public class uglyNumbers {
	
	public static int findNthUgly(int n) {
		int i=1;
		int x=1;
		
		while(n>i) {
			if((x%2 ==0) || (x%3 ==0) || (x%5 ==0) ) {
				i++;
			}
			
			x++;
		}
		x--;
		return x;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();  //testcases
		
		while(t-- > 0) {
			int n = scn.nextInt();
			System.out.println(findNthUgly(n));
		}

	}
	
//	https://www.geeksforgeeks.org/ugly-numbers/

}
