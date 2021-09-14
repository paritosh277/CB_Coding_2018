package june22;

import java.util.Scanner;

public class Is_palindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		
		boolean status = ispalindrome(name);
		System.out.println(status);
		
		if(status==true) {
			substrings(name);
		}

	}
	
	public static boolean ispalindrome(String name) {
		int right=0;
		int left=name.length()-1;
		while(right<left) {
			if(name.charAt(right)!=name.charAt(left)) {
				return false;
			}
			right++;
			left--;
		}
		return true;
	}
	
	public static void substrings(String str) {
		int i,j;
		for(i=0;i<str.length();i++) {
			for(j=i+1;j<=str.length();j++) {
				boolean status=ispalindrome(str.substring(i, j));
				if(status==true) {
					System.out.println(str.substring(i, j));
				}
			}
		}
	}

}
