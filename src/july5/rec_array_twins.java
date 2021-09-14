package july5;

import java.util.Scanner;

public class rec_array_twins {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		System.out.println(removeDuplicate(name));
		

	}
	
	public static String removeDuplicate(String name) {
		StringBuilder sb = new StringBuilder();
		int i=0;
		for(i=0;i<name.length()-1;i++) {
			if(name.charAt(i)!=name.charAt(i+1)) {
				sb.append(name.charAt(i));
			}
		}
		sb.append(name.charAt(i));
		return sb.toString();
	}

}
