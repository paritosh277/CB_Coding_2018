package july5;

import july2.recursionss;

public class RecursionPrint {

	public static void main(String[] args) {
//		printSS("abc", " ");
//		printSSAscii("ab", " ");
//		printKPC("146", " ");
//		printPermutation("abc"," ");
		//lexicoCounting(0,1000);
		System.out.println(printCoinToss(3,""));
		
		//printBoardPath(0,2,"");
	}

	public static void printSS(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		printSS(ros, ans); // no
		printSS(ros, ans + ch); // yes
	}

	public static void printSSAscii(String ques, String ans) {
		
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		printSSAscii(ros, ans);
		printSSAscii(ros, ans + ch);
		printSSAscii(ros, ans + (int) ch);

	}
	
	public static void printKPC(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		
		String code = recursionss.getCode(ch);
		for(int i=0; i<code.length();i++) {
			printKPC(ros,ans+code.charAt(i));
		}
	}
	
	public static void printPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i< ques.length();i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) +  ques.substring(i+1);
			
			
//			System.out.println("* "+ ros+" "+ans+ch);
			
			printPermutation(ros,ans+ch);
		}
	}
	
	public static void lexicoCounting(int curr, int end) {
		if(curr>end) {
			
			return ;
		}
		System.out.println(curr);
		
		int i,count;
		if(curr==0) {
			i=1;
		}else {
			i=0;
		}
		
		for(;i<=9;i++) {
			lexicoCounting(curr*10+i, end);
		}
		
	}
	
//	public static int permutationNoDuplicates(String ques, String ans) {
//		
//	}
	
	public static int printCoinToss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		int h = printCoinToss(n-1, ans+"H");
		int t = printCoinToss(n-1, ans+"T");
		return h+t;
	}
	
	public static int printBoardPath(int curr, int end, String ans) {
		if(curr>end) {
			return 0;
		}
		
		if(curr == end) {
			System.out.println(ans);
			return 1;

		}
		
		int count=0;
		
		for(int dice=1; dice<=6; dice++) {
			count+= printBoardPath(curr+dice, end, ans+dice);
		}
		
		return count;
	}
	
//	public static int printMazePath(int cr, int cc, int er, int ec, String ans) {
//		
//	}
}
