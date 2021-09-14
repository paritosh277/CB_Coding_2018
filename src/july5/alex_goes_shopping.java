package july5;

import java.util.Scanner;

public class alex_goes_shopping {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int q = scn.nextInt();
		while(q>0) {
			int p=0;
			int A = scn.nextInt();
			int k = scn.nextInt();
			for(int j=0;j<n;j++) {
				if((A % arr[j]) == 0) {
					p++;
				}
			}
			
			if(p==k) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			q--;
		}
		

	}

}
