package hackerblockss;

import java.util.Scanner;

public class stringIsPalindrome {
	
	public static boolean isPalindrome(String str) {
		int len =str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-1-i)) {
				return false;
			}else {
				continue;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		str=str.toLowerCase();
		int len = str.length();
		System.out.println(isPalindrome(str));

	}

}
