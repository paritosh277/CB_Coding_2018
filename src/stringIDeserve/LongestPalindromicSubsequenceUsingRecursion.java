package stringIDeserve;

public class LongestPalindromicSubsequenceUsingRecursion {
	public static int lps(String str) {
		if(str.length()==1) {
			return 1;
		}
		int len = str.length();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(len-1);
		
		if(ch1==ch2 && len==2) {
			return 2;
		}
		String ros = str.substring(1,len-1);
//		System.out.println(ros);
		String ros2 = str.substring(0,len-1);
//		System.out.println(ros2);
		String ros3 = str.substring(1);
//		System.out.println(ros3);
		
		if(ch1==ch2) {
			return 2+lps(ros);
		}else {
			return Math.max(lps(ros2), lps(ros3));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		System.out.println(lps(str));

	}

}
