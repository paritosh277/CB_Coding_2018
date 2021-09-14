package hackerblockss;

public class recursionPrintSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSS("xyz");

	}
	
	public static void printSS(String ques) {
		printSS(ques, " ");
	}
	
	private static void printSS(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch =ques.charAt(0);
		String ros = ques.substring(1);
		
		printSS(ros, ans);		//no (We choose not to include the first character)
		printSS(ros, ans+ch);	//yes (We choose to include the first character)
	}

}
