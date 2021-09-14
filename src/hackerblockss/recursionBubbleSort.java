package hackerblockss;

import java.util.Scanner;

public class recursionBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = {99,33,55,22,77};
		recCounterBubble(arr, 0);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void recCounterBubble(int[] arr, int counter) {
		if(counter==arr.length-1) {
			return;
		}
		
		recPairComparison(arr, 0, counter);
		recCounterBubble(arr, counter+1);
	}
	
	public static void recPairComparison(int[] arr, int j, int counter) {
		if(j==arr.length-1-counter) {
			return;
		}
		
		if(arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		}
		
		recPairComparison(arr, j+1, counter);
	}

}
