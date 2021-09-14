package june25;

import java.util.Scanner;

public class String_difference_in_ascii_characters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		System.out.println(difference(name));
	}
	
	public static String difference(String name) {
		StringBuilder sb = new StringBuilder();
		int i;
		for(i=0;i<name.length()-1; i++) {
			sb.append(name.charAt(i));
			sb.append(name.charAt(i+1)-name.charAt(i));
			
		}
		sb.append(name.charAt(i));
		
		return sb.toString();
	}

}
