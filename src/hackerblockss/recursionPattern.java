package hackerblockss;

import java.util.Scanner;

public class recursionPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		patternRecursion(n);

	}
	
	public static void patternRecursion(int n) {
		if(n<1) {
			return;
		}
		
		patternRowRecursion(n);
		
		System.out.println();
		
		patternRecursion(n-1);
	}
	
	public static void patternRowRecursion(int n) {
		if(n<1) {
			return;
		}
		
		System.out.print("*"+" ");
		
		patternRowRecursion(n-1);
	}

}
