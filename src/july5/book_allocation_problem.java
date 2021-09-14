package july5;

import java.util.Arrays;
import java.util.Scanner;

public class book_allocation_problem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int max=0;
			int k=0;
			int l=0;
			int z=0;
			int[] arr = new int[n];
			int[] arr2 = new int[100];
 			for(int i=0; i<n;i++) {
				arr[i] = scn.nextInt();
			}
 			
 			for(int j=0;j<arr.length-1;j++) {
 				int x=0;
 				int y=0;
 				for(k=0;k<=j;k++) {
 					x=x+arr[k];
 				}
 				
 			
 				
 				for(l=k;l<arr.length;l++) {
 					y=y+arr[l];
 				}
 				
 				
 				
 				if(x>y) {
 					arr2[z++]=x;
 				}else {
 					arr2[z++]=y;
 				}
 				
 			}
 			Arrays.sort(arr2,0,z);
 			System.out.println(arr2[0]);
 			
 			
 			
 			
			t--;
		}
		

	}

}
