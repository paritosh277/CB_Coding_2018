package june22;

import java.util.Scanner;

public class toggle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		System.out.println(togglecase(name));
	}
	
	public static String togglecase(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				sb.append((char)(str.charAt(i)+32));
			}else {
				sb.append((char)(str.charAt(i)-32));
			}
		}
		String ans=sb.toString();
		return ans;
	}
	
	

}
