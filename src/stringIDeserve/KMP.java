package stringIDeserve;

public class KMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="ABXABCABCABY";
		String pattern ="ABCABY";
		
		int[] lps = new int[pattern.length()];
		int j=0;
		int i=j+1;
		lps[0]=0;	//initialise lcs[0] to 0
		while(i<pattern.length()) {
			if(pattern.charAt(j)==pattern.charAt(i)) {	//if characters matches increment bot i and j
				lps[i]=j+1; 
				j++;
				i++;
			}else if(pattern.charAt(j)!=pattern.charAt(i) && j==0) {	//if character do not matches and j is at 0
				lps[i]=0;
				i++;
			}else if(pattern.charAt(j)!=pattern.charAt(i)) {//if character do not matches then initialise j to lcs[j-1]
				j=lps[j-1];
			}
		}
		
		for(int k=0; k<pattern.length();k++) {
			System.out.print(lps[k]+" ");
		}
		System.out.println();
		int m=0;
		int n=0;
		while(m<text.length()) {
			if(text.charAt(m)==pattern.charAt(n) && n==pattern.length()-1) {
				int index = m - pattern.length()+1;
				System.out.println("Pattern found at index "+ index );
//				m++;
				n=lps[n-1];
			}else if(text.charAt(m)==pattern.charAt(n)) {
				m++;
				n++;
			}else if(text.charAt(m)!=pattern.charAt(n) && n==0) {
				m++;
			}else if(text.charAt(m)!=pattern.charAt(n)) {
				n=lps[n-1];
			}
		}
	}

}
