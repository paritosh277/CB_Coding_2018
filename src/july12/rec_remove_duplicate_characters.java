package july12;

import java.util.Scanner;

public class rec_remove_duplicate_characters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		StringBuilder sb = new StringBuilder();
		int len = s.length();
		sb=remove_Duplicate(s,sb,0,len);
		System.out.println(sb.toString());

	}
	
	public static StringBuilder remove_Duplicate(String s, StringBuilder sb, int x, int len) {
		if(x==len-1) {
			sb.append(s.charAt(x));
			return sb;
		}
		
		if(s.charAt(x)==s.charAt(x+1)) {
			sb.append(s.charAt(x)+"*");
		}
		
		if(s.charAt(x)!=s.charAt(x+1)) {
			sb.append(s.charAt(x));
		}
		
		remove_Duplicate(s,sb,x+1,len);
		
		return sb;
		
	}

}
