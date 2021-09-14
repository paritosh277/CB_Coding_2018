package july2;

import java.util.Scanner;

public class array_rot_sum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scn.nextInt();
		}
		int t = scn.nextInt();
		int ans=0;
		while(t>0) {
			int m = scn.nextInt();
			if(m<0) {
				m=m+arr1.length;
			}
			
			if(m>arr1.length) {
				m=m%arr1.length;
			}
			
			int arr2[]=rotate(arr1,m);
			
			for(int i=0;i<arr1.length;i++) {
				arr1[i]=arr1[i]+arr2[i];
			}
			t--;
		}
		
		for(int j=0;j<arr1.length;j++) {
			ans= ans+ arr1[j];
		}
		
		System.out.println(ans % (10^9+7));

	}
	
	public static int[] rotate(int[] arr2, int m) {
	
		for(int i=0;i<m;i++) {
			int initial = arr2.length-1;
			
			for(int j= arr2.length-2; j>0; j--) {
				arr2[j]= arr2[j-1];
			}
			arr2[0]=initial;
		}
		return arr2;
	}

}
