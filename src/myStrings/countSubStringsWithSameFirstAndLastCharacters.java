package myStrings;

public class countSubStringsWithSameFirstAndLastCharacters {

	public static void main(String[] args) {
		String str = "aba";
		int count=0;
//		for(int i=0; i<str.length(); i++) {
//			for(int j=1; j<=str.length()-i; j++) {
//				String str2 = new String(str.substring(i,i+j));
//				if(str2.charAt(0)==str2.charAt(str2.length()-1)) {
//					System.out.println(str2);
//					count++;
//				}
//			}
//		}
		
		for(int i=0; i<str.length();i++) {
			for(int j=i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i, j));
				String str2 = new String(str.substring(i, j));
				if(str2.charAt(0)==str.charAt(str2.length()-1)) {
					System.out.println(str2);
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
