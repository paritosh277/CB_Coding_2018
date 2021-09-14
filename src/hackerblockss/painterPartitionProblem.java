package hackerblockss;

import java.util.Scanner;

public class painterPartitionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int painters = scn.nextInt();
		int boards = scn.nextInt();
		int[] boardLenArr = new int[boards];
		for(int i=0; i<boards;i++) {
			boardLenArr[i]=scn.nextInt();
		}
		int start =maxInArray(boardLenArr) ;
//		System.out.println(start);
		int end= sumOfArray(boardLenArr);
//		System.out.println(end);
		int mid=0;
		int ans=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(isValid(boardLenArr, mid, painters)==1) {
				end= mid-1;
				ans=mid;
			}else {
				start=mid+1;
			}
			
		}
		
		System.out.println(ans);

	}
	
	public static int maxInArray(int[] boardLenArr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<boardLenArr.length;i++) {
			if(max<boardLenArr[i]) {
				max=boardLenArr[i];
			}
		}
		return max;
	}
	
	public static int sumOfArray(int[] boardLenArr) {
		int sum=0;
		for(int i=0; i<boardLenArr.length;i++) {
			sum=sum+boardLenArr[i];
		}
		return sum;
	}
	
	public static int isValid(int[] boardLenArr,int mid, int painters) {
		int xpainter=1;
		int sum=0;
		int i=0;
		
		while( i<boardLenArr.length) {
			if(sum+boardLenArr[i]<=mid) {
				sum=sum+boardLenArr[i];
				i++;
			}else {
				xpainter++;
				if(xpainter>painters) {
					return 0;
				}
				sum=0;
				
			}
		}
		return 1;
	}

}
