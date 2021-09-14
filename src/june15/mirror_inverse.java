package june15;

import java.util.Scanner;

public class mirror_inverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean ans = mirrorinverse(n);
		if(ans==true) {
			System.out.println(ans);
		}else {
			System.out.println(ans);
		}

	}
	
	
	public static boolean mirrorinverse(int num) {
		int count=1,ans=0, num2;
		num2=num;
		while(num>0) {
			int rem = num%10;
			ans = ans + count * (int)Math.pow(10, (rem-1));
			num=num/10;
			count++;
		}
		
		if(num2 == ans) {
			return true;
		}else {
			return false;
		}
	}
}
