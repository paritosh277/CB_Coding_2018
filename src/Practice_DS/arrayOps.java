package Practice_DS;

import java.util.Scanner;

public class arrayOps {
	public static int max(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for(int i =0; i<arr.length; i++) {
			if(ans<arr[i]) {
				ans=arr[i];
			}
		}
		return ans;
	}
	
	public static int linearSearch(int[] arr) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter item you want to search");
		int item = scn.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(item==arr[i]) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int binarySearch(int[] arr) {
		Scanner scn = new Scanner(System.in);
		int lo = 0;
		int hi = arr.length-1;
		int mid = (lo + hi)/2;
		System.out.println("Enter the item u want to search");
		int item = scn.nextInt();
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(item<arr[mid]) {
				hi=mid-1;
			}else if(item>arr[mid]) {
				lo=mid+1;
			}else{
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void bubbleSort(int[] arr) {
		for(int it=0; it<arr.length-1; it++) {				//it=iteration
			for(int i=0; i<arr.length-1-it; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int it=0; it<arr.length-1; it++) {
			int min =it;
			for(int i=it+1; i<arr.length; i++) {
				if(arr[min]>arr[i]) {
					min=i;
				}
			}
			if(min!=it) {
				int temp = arr[it];
				arr[it]=arr[min];
				arr[min]=temp;
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		int[] arr = {2,5,8,12,16,23,38,56,72,91};
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//		System.out.println(max(arr));
//		System.out.println(linearSearch(arr));
//		System.out.println(binarySearch(arr));
		bubbleSort(arr);
//		selectionSort(arr);
//		insertionSort(arr);

	}

}
