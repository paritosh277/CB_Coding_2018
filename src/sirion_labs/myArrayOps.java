package sirion_labs;

import java.util.Scanner;

public class myArrayOps {

	public static void main(String[] args) {
		int[] arr = takeInput();
		display(arr);
		max(arr);
		linearsearch(arr);
		binarysearch(arr);

	}
	
	public static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int n = scn.nextInt();
		int[] arr = new int[n];
		System.out.println("Please enter elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static void display(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void max(int[] arr) {
		int i=0;
		int maximum = arr[i];
		for(i=1; i<arr.length; i++) {
			if(maximum<arr[i]) {
				maximum = arr[i];
			}
		}
		
		System.out.println(maximum);
	}
	
	public static void linearsearch(int[] arr) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the element you want to search ");
		int find = scn.nextInt();
		int flag=0;
		int i=0;
		for(i=0; i<arr.length; i++) {
			if(find == arr[i]) {
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at pos "+ (i+1));
		}
		
	}
	
	public static void binarysearch(int[] arr) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the element you want to search ");
		int find = scn.nextInt();
		int low = 0;
		int high = arr.length-1;
		int flag=0;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(find < arr[mid]) {
				high=mid-1;
			}else if(find > arr[mid]){
				low=mid+1;
			}else {
				flag=1
			}
		}
	}
	
	

}
