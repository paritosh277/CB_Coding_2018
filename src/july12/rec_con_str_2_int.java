package july12;

import java.util.Scanner;

public class rec_con_str_2_int {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		int length = name.length();
		System.out.println(changeDigits(name,0,length));

	}
	
	public static int changeDigits(String name, int x, int y) {
		if(x==y) {
			return 0;
		}
		
		//changeDigits(name,x+1,y);
		int z=(name.charAt(y-1-x)-'0')*(int)Math.pow(10, x);
		int w=changeDigits(name,x+1,y);
		//int z=(name.charAt(x)-'0')*(int)Math.pow(10, x+1-y);
		return z+w;
		
		
		
	}

}
