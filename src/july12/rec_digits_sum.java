package july12;

import java.util.Scanner;

public class rec_digits_sum {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		int length = name.length();
		System.out.println(sumDigits(name,0,length));

	}
	
	public static int sumDigits(String name, int x, int y) {
		if(x==y) {
			return 0;
		}
		
		//int z = name.charAt(x)-'0';
		//int w = sumDigits(name,x+1,y);
		//return z+w;
		return (name.charAt(x)-'0')+sumDigits(name,x+1,y);
		
		
		
	}

}
