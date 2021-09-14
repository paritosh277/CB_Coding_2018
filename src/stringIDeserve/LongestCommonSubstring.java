package stringIDeserve;

import java.util.ArrayList;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str2 = "lclc";
		String str1 = "clcl";
		int m=str1.length();
		int n=str2.length();
		int maxLen=0;
		ArrayList<String> ans = new ArrayList<>();
		
		int[][] lcs = new int[m][n];
		int max=0;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(str1.charAt(i)==str2.charAt(j) && (i==0||j==0) ) {
					lcs[i][j]=1;
				}else if(str1.charAt(i)==str2.charAt(j)) {
					lcs[i][j]=lcs[i-1][j-1]+1;

					if(maxLen<lcs[i][j]) {
						maxLen=lcs[i][j];
						ans = new ArrayList<>();
						ans.add(str2.substring(j-maxLen+1,j+1));
					}else if(maxLen==lcs[i][j]) {
						ans.add(str2.substring(j-maxLen+1,j+1));

					}
				}else{
					lcs[i][j]=0;
				}
			}
		}
		
		System.out.println(ans);
		
		

	}

}
