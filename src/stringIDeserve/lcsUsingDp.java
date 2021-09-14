package stringIDeserve;

public class lcsUsingDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Longest common subsequence
		String str1 = "axyt";
		String str2 = "ayzx";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		int m =str1.length();
		int n =str2.length();
		
		int[][] lcs = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || j==0) {
					lcs[i][j]=0;
				}else if(ch1[i-1]==ch2[j-1]) {
					lcs[i][j]=1+lcs[i-1][j-1];
				}else {
					lcs[i][j]=Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
			}
		}
		
		System.out.println(lcs[m][n]);
		
		int x=m;
		int y =n;
		String ans ="";
		
		while(x>0 && y>0 && lcs[x][y]!=0) {
			if(lcs[x-1][y]==lcs[x][y-1]) {
				ans+=ch1[x-1];
				x--;
				y--;
			}else {
				int q = lcs[x-1][y];
				int r = lcs[x][y-1];
				
				if(q>r) {
					x--;
				}else {
					y--;
				}
			}
		}
		
		System.out.println(ans);

	}

}
