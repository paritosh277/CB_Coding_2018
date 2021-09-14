package june22;

import java.util.Scanner;

public class strings_odd_even_character {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		System.out.println(togglecase(name));

	}
	
	public static String togglecase(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length();i++) {
			if(i%2==0) {
				sb.append((char)(str.charAt(i)+1));
			}else {
				sb.append((char)(str.charAt(i)-1));
			}
		}
			
			
		String ans=sb.toString();
		return ans;
	}
	

}
