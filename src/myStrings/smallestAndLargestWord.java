package myStrings;

public class smallestAndLargestWord {

	public static void main(String[] args) {
		String str = "GeeksforGeeks A computer Science portal for Geeks";
		int minLength=str.length();
		int maxLength=0;
		String small = new String();
		String large = new String();
		int si, ei, minStartIndex=0, maxStartIndex=0;
		for(int i=0; i<str.length(); i++) {
			si=i;
			ei=i+1;
			while(ei<str.length() && str.charAt(ei)!=' ') {
				ei++;
			}
			int len = ei-si;
			if(len<minLength) {
				minLength=len;
				minStartIndex = si;
//				small=str.substring(si,ei);
			}
			
			if(len>maxLength) {
				maxLength=len;
				maxStartIndex = si;
//				large=str.substring(si,ei);
			}
			i=ei;
		}
		
		System.out.println(str.substring(minStartIndex, minStartIndex+minLength));
		System.out.println(str.substring(maxStartIndex, maxStartIndex+maxLength));

	}

}
