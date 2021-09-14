package hackerblockss;

import java.util.Scanner;

public class replaceAllpi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while(n>0) {
			String ques = scn.next();
			replacePi(ques);
			n--;
		}

	}
	
	public static void replacePi(String ques) {
		replacePi(ques,"");
	}
	
	private static void replacePi(String ques, String ans) {
		if(ques.length()==1) {
			System.out.println(ans+ques);
			return;
		}
		char ch = ques.charAt(0);
		char chh = ques.charAt(1);
		String ros = ques.substring(1);
		
		if(ch=='p' && chh=='i') {
			replacePi(ques.substring(2), ans+"3.14");
		}else {
			replacePi(ros,ans+ch);
		}
	}

}
