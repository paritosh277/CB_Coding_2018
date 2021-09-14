package july12;

import java.util.Scanner;

public class rec_duplicate_char_format {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		int len= s.length();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println(duplicate(s,sb,0,len));

	}
	
	public static String duplicate(String s, StringBuilder sb,int x,int y) {
		if(x==y) {
			
			return " ";
		}
		
		if(s.charAt(x)==s.charAt(x+1)) {
			sb.append(s.charAt(x)+'*');
			return sb.toString();
		}
		
		
	}

}
