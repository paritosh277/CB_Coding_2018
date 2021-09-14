package hackerblockss;

import java.util.Scanner;

public class stringsMaxFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str ="aaabacbxxxxxxppppppppbbhsgjhajsfjcjpppppp";
		int[] arr =new int[26];
		for(int i=0; i<arr.length;i++) {
			arr[i]=0;
		}
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-'a']++;
		}
		
		int max=0;
		
		for(int i=1;i<arr.length; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		
		char ch = (char)(max+'a');
		System.out.println(ch);

	}

}
