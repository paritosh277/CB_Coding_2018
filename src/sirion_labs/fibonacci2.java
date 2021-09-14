package sirion_labs;

import java.util.Scanner;

public class fibonacci2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. of terms you want to print ?");
		int n = scn.nextInt();
		int t1 = 0;
		int t2 = 1;
		
		int sum;
		
		System.out.print(t1 + " " + t2);
		
		for(int i=2; i<n; i++) {
			sum = t1+t2;
			System.out.print(" " + sum);
			t1=t2;
			t2=sum;
		}

	}

}
