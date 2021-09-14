package hackerblockss;

import java.util.Scanner;
import java.util.Stack;

public class longestValidParenthesis {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "()(()))))";
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		int max=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				st.push(i);
			}else {
				st.pop();
				
				if(!st.isEmpty()) {
					max= Math.max(max, i-st.peek());
				}else {
					st.push(i);
				}
			}
		}
		
		System.out.println(max);;
		

	}

}
