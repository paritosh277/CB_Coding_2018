package hackerblockss;

import java.util.Arrays;
import java.util.Scanner;

public class aggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = scn.nextInt();
		int[] stalls = new int[n];
		for(int i=0; i<stalls.length; i++) {
			stalls[i]=scn.nextInt();
		}
		Arrays.sort(stalls);
		
//		int start=stalls[0];
//		int end=stalls[n-1];
		int mid=0;
		int start=0;
		int ans=0;
		int end=stalls[n-1]-stalls[0];
		while(start<=end) {
			mid=(start+end)/2;
			if(isValid(stalls, mid,c)==1) {
				start=mid+1;
				ans=mid;
//				break;
			}else {
				end=mid-1;
			}
		}
		System.out.println(ans);
		

	}
	
	public static int isValid(int[] stalls,int mid, int c) {
		int cow = 1;
		int currently_alloted=stalls[0];
		for(int i=1; i<stalls.length; i++) {
			if(stalls[i]-currently_alloted>=mid) {
				cow++;
				currently_alloted=stalls[i];
				if(cow==c) {
					return 1;
				}
			}
		}
		return 0;
	}

}
