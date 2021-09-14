package hackerblockss;

import java.util.Scanner;

public class alex_goes_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] price = new int[n];
		
		for(int i=0; i<n; i++) {
			price[i]=scn.nextInt();
		}
		
		int money = scn.nextInt();
		int k = scn.nextInt();
		int item=0;
		
		for(int i=0; i<n; i++) {
			if(money>=price[i]) {
				if(money%price[i]==0) {
					item++;
				}
			}
			
		}
		
		if(item==k) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}

	}

}
