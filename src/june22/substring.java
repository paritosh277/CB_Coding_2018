package june22;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		System.out.println(name);
		substrings(name);

	}
	
	public static void substrings(String str) {
		int i,j;
		for(i=0;i<str.length();i++) {
			for(j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
