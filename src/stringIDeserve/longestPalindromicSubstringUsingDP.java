package stringIDeserve;

public class longestPalindromicSubstringUsingDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "banana";
		int palindromeBeginsAt=0;
		int len = str.length();
		int maxlen=1;
		boolean[][] palindrome = new boolean[len][len];
		
		//single letter palindrome
		for(int i=0; i<len; i++) {
			palindrome[i][i]=true;
		}
		
		//two letter palindrome
		for(int i=0; i<len-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				palindrome[i][i+1]=true;
				palindromeBeginsAt=i;
				maxlen=2;
			}else {
				palindrome[i][i+1]=false;
			}
		}
		
		//three or more letter palindrome
		for(int i=2; i<len;i++) {
			for(int j=0; j<len-i; j++) {
				if(str.charAt(j)==str.charAt(j+i) && palindrome[j+1][j+i-1]==true) {
					palindrome[j][j+i]=true;
					palindromeBeginsAt=j;
					maxlen=i+1;
				}
			}
		}
		
		System.out.println(str.substring(palindromeBeginsAt,palindromeBeginsAt+maxlen));

	}

}
