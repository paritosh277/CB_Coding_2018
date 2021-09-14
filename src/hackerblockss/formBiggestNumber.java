package hackerblockss;

import java.util.Scanner;

public class formBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			
			for(int i=0; i<n ;i++) {
				arr[i]=scn.nextInt();
			}
			
			sort(arr);
			
			for(int i=0; i<n; i++) {
				System.out.print(arr[i]);
			}
		}

	}
	
	public static void sort(int[] arr) {
		for(int counter=0; counter<arr.length; counter++) {
			for(int j=0; j<arr.length-1-counter; j++) {
				if(compare(arr[j],arr[j+1])>0) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static int compare(int n1, int n2) {
		String s1 = Integer.toString(n1);
		String s2 = Integer.toString(n2);
		
		String val1 = s1+s2;
//		System.out.println(val1);
		String val2 = s2+s1;
//		System.out.println(val2);
		
		int x1 = Integer.parseInt(val1);
//		System.out.println(x1);
		int x2 = Integer.parseInt(val2);
//		System.out.println(x2);
		if(x1>x2) {
			return -1;
		}else {
			return 1;
		}
	}

}
