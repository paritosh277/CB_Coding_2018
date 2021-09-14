package stringIDeserve;

public class patternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdabcabcdf";		//"AABAACAADAABAABA";
		String pattern = "abcdf";				//"AABA";
		int len = pattern.length();
		int len2 = str1.length();
		boolean status=false;
		
		for(int k=0; k<=len2-len; k++) {	//if pattern and text do not match, increment pointer of text by one
											//and initialise pointer of pattern to first character of pattern
			int i=k;										
			int j=0;
			while(str1.charAt(i)==pattern.charAt(j)) {	//If both text and pattern matches increment pointers 
														//both at text and pattern
				i++;
				j++;
				if(j==len) {							//if pointer at pattern exceeds pattern length (pattern matches)
					status = true;
					System.out.println("found at "+k);
					break;
				}
			}
		}
		if(!status) {
			System.out.println(" Not found");
		}

	}

}
