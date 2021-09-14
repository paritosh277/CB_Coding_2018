package june21;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_summ {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			int[] a1= {9,8,6,9};
			int[] a2= {9,5,8};
			
			System.out.println(sum(a1,a2));
	}
	
	public static ArrayList<Integer> sum(int[] a1, int[] a2){
		ArrayList<Integer> list1 = new ArrayList<>();
		int i=a1.length-1;
		int j=a2.length-1;
		
		int carry=0;
		while(i>=0 || j>=0) {
			int sum2=carry;
			if(i>=0) {
				sum2+=a1[i];
			}
			if(j>=0) {
				sum2+=a2[j];
			}
			
			list1.add(sum2 % 10);
			carry=sum2/10;
			i--;
			j--;
		}
		
		if(carry!=0) {
			list1.add(carry);
		}
		return list1;
	}	
		

}
