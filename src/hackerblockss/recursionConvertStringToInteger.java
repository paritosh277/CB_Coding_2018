package hackerblockss;

import java.util.Scanner;

public class recursionConvertStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String ques = scn.next();
		convert(ques);

	}
	
	public static void convert(String ques) {
		int ans =0;
		convert(ques, ans);
	}
	
	private static void convert(String ques, int ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		int ch = ques.charAt(0)-'0';	//converts character to an integer. //The ASCII code for 0 is 48
//		int ch = Integer.parseInt(ques.charAt(0));
		String ros = ques.substring(1);

		
		ans = ans + ch * (int)Math.pow(10, ros.length());
		
		convert(ros, ans);
		
		
	}

}
