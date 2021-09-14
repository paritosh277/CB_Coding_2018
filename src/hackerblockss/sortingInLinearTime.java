package hackerblockss;

import java.util.Scanner;

public class sortingInLinearTime {
	//Segregate 0s, 1s and 2s together
	//Dutch National Flag Problem
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=scn.nextInt();
		}
		
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high) {
			switch(arr[mid]) {
				case 0:{
					int temp = arr[mid];
					arr[mid]=arr[low];
					arr[low]=temp;
					low++;
					mid++;
					break;
				}
				
				case 1:{	
					mid++;
					break;
					
				}
				
				case 2:{
					int temp = arr[mid];
					arr[mid]=arr[high];
					arr[high]=temp;
					high--;
					break;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
