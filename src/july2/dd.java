package july2;

import java.util.Scanner;

public class dd {

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
		
		
		return (sumDigits(name,x++,y)+name.charAt(x));
		
	}

}
