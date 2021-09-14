package june15;
import java.util.Scanner;

public class arrayops {

	public static void main(String[] args) {
		int arr[] = takeInput();
		display(arr);
		// max(arr);
		// linearsearch(arr);
		//int flag = binarysearch(arr);
		//if (flag == 1) {
		//	System.out.println("Found");
		//} else {
		//	System.out.println("Not Found");
		//}
		
		bubblesort(arr);
		insertionsort(arr);

	}

	public static int[] takeInput() {
		System.out.println("Enter the size?");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void max(int[] arr) {
		int max = Integer.MIN_VALUE; // max=a[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max is " + max);
	}

	public static void linearsearch(int[] arr) {
		System.out.println("Enter the item you want to search");
		Scanner scn = new Scanner(System.in);
		int item = scn.nextInt();
		int flag = 0, i = 0;
		for (i = 0; i < arr.length; i++) {
			if (item == arr[i]) {
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			System.out.println("Found at pos " + (i + 1));
		} else {
			System.out.println("Not Found");
		}

	}

	public static int binarysearch(int[] arr) {
		System.out.println("Enter the item you want to search");
		Scanner scn = new Scanner(System.in);
		int item = scn.nextInt();
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (item < arr[mid]) {
				high = mid - 1;
			} else if (item > arr[mid]) {
				low = mid + 1;
			} else {
				return 1;
			}
		}
		return -1;
	}

	public static void bubblesort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		display(arr);
	}
	
	
	public static void insertionsort(int[] arr) {
		for(int i=1; i<arr.length;i++) {
			int j = i-1;
			int temp = arr[i];
			
			while(j>=0 && temp<arr[j]) {
				arr[j+1] = arr [j];
				j--;
			}
			arr[j+1]=temp;
		}
		display(arr);
	}
}
