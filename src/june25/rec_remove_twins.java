package june25;

import java.util.Arrays;
import java.util.Scanner;

public class rec_remove_twins {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		//System.out.println(sorted);
		removeTwins(sorted);

	}
	public static void removeTwins(String sorted) {
		int count = 0;
		int i=0,j=0;
		int len = sorted.length();
		for(i=0;i<len-1;i++) {
			for(j=i+1;j<len;j++) {
				if(sorted.charAt(i)!=sorted.charAt(j)) {
					break;
				}else {
					count++;
				}
				
			}
			i=j-1;
		}
		System.out.println(count);
		
		
	}

}
