package june15;

import java.util.Scanner;

public class square_root {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
//		int ans=squareroot(n);
		System.out.println(Math.sqrt(n));
		
//		Scanner sc=new Scanner(System.in);
//		int num;
//
//		System.out.print("Enter an integer number: ");
//		num=sc.nextInt();
//
//		System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
//		System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
//		System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));

	}
	
//	public static int squareroot(int n) {
//		if(n==0 || n==1) {
//			return n;
//		}
//		
//		int i=1,result=0;
//		while(result<=n) {
//			i++;
//			result=i*i;
//		
//		}
//		return (i-1);
//	}

}
