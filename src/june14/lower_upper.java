package june14;

import java.util.Scanner;

public class lower_upper {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.nextLine().charAt(0);
		
//		if(ch >= 'a' && ch<='z') {
//			System.out.println("lower case");
//		}else if(ch>='A' && ch<='Z') {
//			System.out.println("upper case");
//		}else {
//			System.out.println("invalid");
//		}
		
		if(ch >= 97 && ch<=122) {
			System.out.println("lower case");
		}else if(ch>=65 && ch<=90) {
			System.out.println("upper case");
		}else {
			System.out.println("invalid");
		}

	}

}
