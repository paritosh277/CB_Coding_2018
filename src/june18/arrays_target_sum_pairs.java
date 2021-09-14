package june18;

import java.util.Scanner;

public class arrays_target_sum_pairs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int target = scn.nextInt();
		
		pair(arr, target);

	}
	
	public static void pair(int arr[], int target) {
		for(int i=0; i < arr.length; i++){
	        int min=i;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[min]>arr[j]){
	                min=j;
	            }
	        }
	        int temp= arr[min];
	        arr[min]=arr[i];
	        arr[i]= temp;
	    }
		
		
		
		for(int i=0;i < arr.length; i++) {
			for(int j =i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println(arr[i]+ " and "+ arr[j]);
				}
			}
		}
	}
}
