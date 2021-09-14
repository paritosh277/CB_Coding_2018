package sirion_labs;

import java.util.Scanner;
import java.util.Stack;

public class myBalancedParenthesis {
	
	public static boolean isMatch(char ch1, char ch2) {
		if(ch1=='(' && ch2==')') {
			return true;
		}else if(ch1=='{' && ch2 =='}') {
			return true;
		}else if(ch1=='[' && ch2 ==']') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}else if(ch==')' || ch=='}' || ch==']') {
				if(st.isEmpty()) {
					return false;
				}
				
				if(isMatch(st.peek(), ch)){
					st.pop();
				}else {
					return false;
				}
			}
		}
		
		if(st.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		boolean ans = isBalanced(str);
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
