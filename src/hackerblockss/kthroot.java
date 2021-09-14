package hackerblockss;

import java.util.Scanner;

public class kthroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextInt();
		int k = scn.nextInt();
		
		int x=1;
		
		while(Math.pow(x,k)<=n) {
			x++;
		}
		x--;
		System.out.println(x);

	}

}
