package hackerblockss;

import java.util.Scanner;

public class samsung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=scn.nextInt();
			}
			
			int ans = 0;
			ans = arr[0]^arr[1];
			int operation = 2;
			
			for(int i=2; i<arr.length; i++) {
				if(operation%3==1) {
					ans = ans^arr[i];
				}else if(operation%3==2) {
					ans=ans&arr[i];
				}else {
					ans=ans|arr[i];
				}
				operation++;
			}
			
			if(ans%2==0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
			
			t--;
		}

	}

}
