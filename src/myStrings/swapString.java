package myStrings;

public class swapString {

	public static void main(String[] args) {
		String str = "Hello";
		char[] ch = str.toCharArray();
		int len = ch.length;
		
//		StringBuilder sb = new StringBuilder("Hello");
//		int length = sb.length();
		char temp;
		for(int i=0; i<=len/2; i++) {
			temp=ch[i];
			ch[i]=ch[len-i-1];
			ch[len-i-1]=temp;
		}
		
		System.out.println(new String(ch));

	}

}
