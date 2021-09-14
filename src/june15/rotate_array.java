package june15;

import java.util.Scanner;

public class rotate_array {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		if (n < 0) {
			n = n + arr.length;
		}
		if (n >= arr.length) {
			n = n % arr.length;
		}

		/*
		 * if(n< -arr.length) { n=n%arr.length; }
		 */

//		if (n >= 0) {
			for (int i = 0; i < n; i++) {
				int initial = arr[arr.length - 1];
				for (int j = arr.length - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = initial;
			}
//		}

		/*
		 * if(n<0) { for(int i=0; i>n; i--) { int initial = arr[0]; for(int j=0;
		 * j>arr.length; j++) { arr[j]=arr[j+1]; } arr[arr.length-1]=initial; } }
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
