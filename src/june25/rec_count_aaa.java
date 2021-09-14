package june25;

import java.util.Scanner;

public class rec_count_aaa {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		
		int len = s.length();
		
		
		System.out.println(remove_AAA(s,0,len,0));
		System.out.println(remove1_AAA(s,0,len,0));
	}
	
	public static int remove_AAA(String s, int x, int len,int count) {
		if(x==len-2) {
			
			return count;
		}
		
		
		
		if(s.charAt(x)=='a' && s.charAt(x+1)=='a' && s.charAt(x+2)=='a') {
			count++;
		}
		
		
		
		int j=remove_AAA(s,x+1,len,count);
		
		return j;
		
	}
	
	public static int remove1_AAA(String s, int x, int len,int count) {
		if(x==len-2) {
			
			return count;
		}
		
		
		
		if(s.charAt(x)=='a' && s.charAt(x+1)=='a' && s.charAt(x+2)=='a') {
			count++;
			int j=remove1_AAA(s,x+3,len,count);
			
		}else {
			int z = remove1_AAA(s,x+1,len,count);
		}
		
		
		
		
		
		return j+z;
		
	}

}
