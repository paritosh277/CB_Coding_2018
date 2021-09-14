package hackerblockss;

import java.util.Scanner;

public class recursionFlippingCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of flips");
		int n = scn.nextInt();
		System.out.println(coinToss(n));
	}
	
	public static int coinToss(int n) {
		return coinToss(n,"");
	}
	
	private static int coinToss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		
		int h = coinToss(n-1,ans+"H");
		int t = coinToss(n-1, ans+"T");
		
		return h+t;
	}

}
