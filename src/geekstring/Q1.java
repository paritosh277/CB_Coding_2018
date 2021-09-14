package geekstring;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = new String("kittu");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(i==0) {
				sb.append(str.charAt(str.length()-1));
			}else if(i==str.length()-1) {
				sb.append(str.charAt(0));
			}else {
				sb.append(str.charAt(i));
			}
		}
		String str1 = sb.toString();
		System.out.println(str1);

	}

}
