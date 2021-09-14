package hackerblockss;

public class recursionPrintKPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printKPC("12");
		

	}
	
	public static String getCode(char ch) {
//		if(ch=='1') {
//			return "abc";
//		}else if(ch=='2') {
//			return "def";
//		}else if(ch=='3') {
//			return "ghi";
//		}else if(ch=='4') {
//			return "jklm";
//		}else if(ch=='5') {
//			return "nop";
//		}else if(ch=='6') {
//			return "qr";
//		}else if(ch=='7') {
//			return "stu";
//		}else if(ch=='8') {
//			return "vw";
//		}else if(ch=='9') {
//			return "xyz";
//		}else if(ch=='0') {
//			return "#$";
//		}else {
//			return " ";
//		}
		
		if(ch=='2') {
			return "abc";
		}else if(ch=='3') {
			return "def";
		}else if(ch=='4') {
			return "ghi";
		}else if(ch=='5') {
			return "jkl";
		}else if(ch=='6') {
			return "mno";
		}else if(ch=='7') {
			return "pqrs";
		}else if(ch=='8') {
			return "tuv";
		}else if(ch=='9') {
			return "wxyz";
		}else if(ch=='1') {
			return ".+@$";
		}else {
			return " ";
		}
	}
	
	public static void printKPC(String ques) {
		printKPC(ques, " ");
	}
	
	private static void printKPC(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		
		String code = getCode(ch);
		
		for(int i=0; i<code.length();i++) {
			printKPC(ros, ans+code.charAt(i));
		}
	}

}
