package stringIDeserve;

public class LongestPalindromicSubstringNormal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "forgeeksskeegfor";
		String longPalindrome="";
		for(int i=0; i<str.length();i++) {
			for(int j=i+1; j<=str.length(); j++) {
				String str2 = str.substring(i,j);
				int len=str2.length();
				boolean status = true;
				int k=0;
				while(k<len/2) {
					if(str2.charAt(k)==str2.charAt(len-1-k)) {
						k++;
					}else {
						status = false;
						break;
					}
				}
				
				if(status) {
					if(longPalindrome.length()<str2.length()) {
							longPalindrome=str2;
					}
				}
				
			}
		}
		
		System.out.println(longPalindrome);

	}

}
