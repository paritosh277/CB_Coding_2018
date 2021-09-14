package geekstring;

import java.util.Scanner;

public class swapFirstAndLastCharactersOfWords {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "geeks for geeks";
		char[] ch = str.toCharArray();
		int i=0;
		int j=0;
		char temp;
		i=j;
		for(j=0;j<ch.length;j++) {
			while(j<ch.length && ch[j]!=' ') {
				j++;
			}
			
			temp = ch[j-1];
			ch[j-1]=ch[i];
			ch[i]=temp;
			
			i=j+1;
		}
		
		String s = new String(ch);
		System.out.println(s);

	}

}
