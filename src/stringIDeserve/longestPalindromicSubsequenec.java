package stringIDeserve;

public class longestPalindromicSubsequenec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "adbgcfbea";
		int len = str.length();
		int[][] lps = new int[len][len];
		
		//one letter palindrome
		for(int i=0; i<len;i++) {
			lps[i][i]=1;
		}
		
		//more than one letter palindrome
		for(int i =1; i<len; i++) {
			for(int j=0;j<len-i;j++) {
				if(str.charAt(j)==str.charAt(j+i)) {
					lps[j][j+i]=2+lps[j+1][j+i-1];
				}else {
					lps[j][j+i]=Math.max(lps[j][j+i-1], lps[j+1][j+i]);
				}
			}
		}
		System.out.println(lps[0][len-1]);

	}

}
