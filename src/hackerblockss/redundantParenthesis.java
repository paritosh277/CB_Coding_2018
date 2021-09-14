package hackerblockss;

import java.util.Scanner;
import java.util.Stack;

public class redundantParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			String str = scn.next();
			
			if(checkDuplicates(str)) {
				System.out.println("Duplicate");
			}else {
				System.out.println("Not Duplicate");
			}
			t--;
		}

	}
	
	public static boolean checkDuplicates(String str) {
		Stack<Character> st = new Stack<>();
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==')') {
				int counter = 0;
				while(st.peek()!='(') {
					counter++;
					st.pop();
				}
				st.pop();
				
				if(counter<=1) {
					return true;
				}
			}else {
				st.push(ch);
			}
		}
		
		return false;
	}

}
