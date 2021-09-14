package hackerblockss;

import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {
	
	public static boolean isMatch(char ch1, char ch2) {
		if(ch1=='(' && ch2==')') {
			return true;
		}else if(ch1=='{' && ch2=='}') {
			return true;
		}else if(ch1=='[' && ch2==']') {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i)== '(' || str.charAt(i)=='[' || str.charAt(i)=='{') {
				char ch = str.charAt(i);
				st.push(ch);
				
//				System.out.println("1");
			}else {
				char ch=str.charAt(i);
				if(st.isEmpty() || (isMatch(st.peek(), ch)==false)) {
//					System.out.println("2");
					return false;
				}
				if((isMatch(st.peek(),ch)) == true) {
//					System.out.println("3");
					st.pop();
				}
				
			}
		}
		if(st.isEmpty()) {
//			System.out.println("4");
			return true;
		}else {
//			System.out.println("5");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str ="[{()}]{";
		boolean ans = isBalanced(str);
		
		if(ans) {
			System.out.println("BALANCED");
		}else {
			System.out.println("NOT BALANCED");
		}
		

	}

}
