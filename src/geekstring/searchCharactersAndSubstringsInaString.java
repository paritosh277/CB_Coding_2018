package geekstring;

public class searchCharactersAndSubstringsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "GeeksforGeeks";
		String str2 = "e";
		int len = str2.length();
		for(int i =0; i<=str1.length()-len;i++) {
			String str3 = new String(str1.substring(i, i+len));
			if(str2.equals(str3)) {
				System.out.println(i);
			}
		}
		
		

	}

}
