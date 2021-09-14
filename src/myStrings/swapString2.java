package myStrings;

public class swapString2 {

	public static void main(String[] args) {
		String str = "geeks for geeks";
		char[] ch = str.toCharArray();
		int len = ch.length;
		char temp;
		
		for(int i=0; i<len;i++) {
			int j=i;
			while(i<len && ch[i] !=' ') {
				i++;
			}
			temp = ch[j];
			ch[j] = ch[i-1];
			ch[i-1] = temp;
			
			
		}
		
		System.out.println(new String(ch));
	}

}
