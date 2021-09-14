package hackerblockss;

import java.util.Scanner;

public class recursionRemoveDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String ques = scn.next();
		removeDuplicates(ques);

	}
	
	public static void removeDuplicates(String ques) {
		removeDuplicates(ques," ");
	}
	
	private static void removeDuplicates(String ques, String ans) {
		if(ques.length()==1) {
			System.out.println(ans+ques);
			return;
		}
		
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		
		if(ch==ros.charAt(0)) {
//			removeDuplicates(ros, ans);
			removeDuplicates(ros, ans+ch+"*");
		}else {
			removeDuplicates(ros, ans+ch);
		}
			
		
	}

}
