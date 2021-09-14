package hackerblockss;

import java.util.ArrayList;
import java.util.Scanner;

public class sumOfTwoArray {
	public static void arrSum(int[] arr1,int[] arr2) {
		ArrayList<Integer> ans = new ArrayList<>();
		int carry=0;
		int i = arr1.length-1;
		int j = arr2.length-1;
		
		while(i>=0 || j>=0) {
			int sum=carry;
			
			if(i>=0) {
				sum+=arr1[i];
			}
			
			if(j>=0) {
				sum+=arr2[j];
			}
			
			if(sum>=10) {
				sum=sum-10;
				carry=1;
			}else {
				carry=0;
			}
			
			ans.add(0, sum);
			i--;
			j--;
		}
		if(carry!=0) {
			ans.add(0, carry);
		}
		for(int x=0; x<ans.size(); x++) {
			System.out.print(ans.get(x)+ ", ");
		}
		System.out.print("END");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=scn.nextInt();
		}
		int m = scn.nextInt();
		int[] arr2 = new int[m];
		for(int j=0; j<arr2.length; j++) {
			arr2[j]= scn.nextInt();
		}
		
		arrSum(arr1, arr2);
		

	}

}
