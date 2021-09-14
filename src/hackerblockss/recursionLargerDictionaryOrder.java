package hackerblockss;

import java.util.Scanner;

public class recursionLargerDictionaryOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		String ques = scn.next();
		String str = scn.next();
//		String quess =scn.next();
		printLargerDict(str);

	}
	
	public static void printLargerDict(String str) {
		printLargerDict(str,str,"");
	}
	
	private static void printLargerDict(String str, String ques, String ans) {
		if(ques.length()==0) {
			if(ans.compareTo(str) > 0) {
				System.out.println(ans);
			}
			
//			if(ans.compareTo(str) < 0) {
//				System.out.println(ans);
//			}
				
			return;
		}
		
		for(int i=0; i<ques.length();i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0,i) + ques.substring(i+1);
			
			printLargerDict(str, ros, ans+ch);
		}
	}
	
	
	
	

}
