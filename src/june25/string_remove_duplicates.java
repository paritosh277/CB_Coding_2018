package june25;

import java.util.Scanner;

public class string_remove_duplicates {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		System.out.println(remdup(s));
	}
	
	public static String remdup(String s) {
		StringBuilder sb = new StringBuilder();
		int i=0;
		for(i=0; i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				sb.append(s.charAt(i));
			}
		}
		sb.append(s.charAt(i));
		return sb.toString();
	}

}
