package hackerblockss;

import java.util.Scanner;

public class primeVisits {
	
	public static int pmo(int a, int b) {
		int count=0;
		while(a<=b) {
			int counter=0;
			for(int i=1;i<=a; i++) {
				if(a%i==0) {
					counter++;
				}
			}
			if(counter==2) {
				count++;
			}
			a++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of test cases");
		int n = scn.nextInt();
		while(n>0) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			System.out.println(pmo(a,b));
			n--;
		}

	}

}
