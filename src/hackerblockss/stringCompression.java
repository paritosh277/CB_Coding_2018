package hackerblockss;

import java.util.Scanner;

public class stringCompression {
	
	public static void compress(String str) {
		int[] arr = new int[26];
		char ch;
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-'a']++;
		}
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==1) {
				ch=(char)(i+'a');
				ans+=ch;
			}
			
			if(arr[i]!=0 && arr[i]!=1) {
				ch=(char)(i+'a');
				ans+=ch;
				ans+=arr[i];
			}
		}
		System.out.println(ans);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
//		compress(str);
		int count = 1;
		String ans="";
		for(int i=0; i<str.length(); i++) {
			
//			
			
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ) {
				count++;
				i++;
			}
			ans+=str.charAt(i);
			if(count!=1) {
				ans+=count;
			}
			
			count=1;
		}
		
		System.out.println(ans);

	}

}
