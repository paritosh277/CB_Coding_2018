package july5;

import java.util.Scanner;

public class med_of_sorted_arr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[2*n];
		int l =0;
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=scn.nextInt();
		}
		
		for(int j=0; j<arr2.length;j++) {
			arr2[j]=scn.nextInt();
		}
		
		for(int k=0;k<arr1.length;k++) {
			arr3[l++]=arr1[k];
		}
		
		for(int m=0;m<arr1.length;m++) {
			arr3[l++]=arr2[m];
		}
		
		bubblesort(arr3,l-1);
		

	}
	
	public static void bubblesort(int[] arr, int l) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(arr[l/2]);
	}

}
