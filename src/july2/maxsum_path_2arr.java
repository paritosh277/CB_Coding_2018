package july2;

import java.util.Scanner;

public class maxsum_path_2arr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr1 = new int[n];
			for(int i=0; i<n; i++) {
				arr1[i]=scn.nextInt();
			}
			int[] arr2 = new int[m];
			for(int j=0; j<m; j++) {
				arr2[j]=scn.nextInt();
			}
		
			
			System.out.println(maxsum(arr1, arr2));
			t--;
		}
	}
	
	public static int maxsum(int[] arr1, int[] arr2) {
		int result=0, sum1=0, sum2=0;
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				sum2+=arr2[j++];
			}else if(arr1[i]<arr2[j]) {
				sum1+=arr1[i++];
			}else {
				result+=max(sum1,sum2);
				sum1=0;
				sum2=0;
				result=result+arr1[i++];
				j++;
			}
		}
		
		while(i<arr1.length) {
			sum1+=arr1[i++];
		}
		
		while(j<arr2.length) {
			sum2+=arr2[j++];
		}
		
		result+=max(sum1,sum2);
		
		return result;
	}
	
	public static int max(int sum1, int sum2) {
		if(sum1>sum2) {
			return sum1;
		}else {
			return sum2;
		}
	}

}
