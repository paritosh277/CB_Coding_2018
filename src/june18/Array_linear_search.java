package june18;

import java.util.Scanner;

public class Array_linear_search {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int m = scn.nextInt();
		
		int a = linearsearch(arr, m);
		System.out.println(a);
		
	}
	
	public static int linearsearch(int[] arr, int m) {
		int flag=0, i=0;
		for (i = 0; i < arr.length; i++) {
			if (m == arr[i]) {
				flag = 1;
				break;
			}
		}
		
		if(flag==0) {
			return -1;
		}else{
			return i;
		}
		
	}

}
