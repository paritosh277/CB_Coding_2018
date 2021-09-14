package hackerblockss;

import java.util.Scanner;

public class stringDifferencesInAsciiCodes {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = "";
		for(int i=0; i<str.length()-1; i++) {
			ans+=str.charAt(i);
			int diff = str.charAt(i+1)-str.charAt(i);
			ans+=diff;
		}
		ans+=str.charAt(str.length()-1);
		System.out.println(ans);
		

	}

}
