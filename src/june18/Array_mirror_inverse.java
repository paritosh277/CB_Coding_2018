package june18;

import java.util.Scanner;

public class Array_mirror_inverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		int flag=1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scn.nextInt();
		}
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[arr[i]] = i;
		}
		
		for (int i = 0; i < arr3.length; i++) {
			if(arr2[i]!=arr3[i]) {
				flag=0;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
			
		
		
	}

}
