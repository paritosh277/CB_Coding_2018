package myStrings;

import java.util.Scanner;

public class kthCharDecryptStr {

	public static void main(String[] args) {
		String str = "ab4c2ed3";
		StringBuilder sb = new StringBuilder();
		int start =0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				sb.append((char)(str.charAt(i)));
			}else {
				int freq = str.charAt(i)-48;
				int end =i;
				for(int j= freq-1; j>0 ;j--) {
					sb.append((String)(str.substring(start, end)));
				}
				start = i+1;
			}
		}
		String ans = sb.toString();
		System.out.println(ans);
		
		Scanner scn = new Scanner(System.in);
		int index = scn.nextInt();
		System.out.println(ans.charAt(index));

	}

}
