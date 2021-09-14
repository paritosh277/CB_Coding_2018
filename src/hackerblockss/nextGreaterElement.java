package hackerblockss;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();
		
		int i=0;
//		st.push(i);
//		i++;
		while(i<arr.length) {
			
			if(st.isEmpty() || arr[i]<arr[st.peek()]) {
				st.push(i);
			}else if(arr[i]>arr[st.peek()]) {
				while((!st.isEmpty()) && arr[i]>arr[st.peek()]) {
					ans[st.pop()]=arr[i];
				}
				st.push(i);
			}
		
			i++;
		}
		
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		
		for(int k=0;k<ans.length;k++) {
			System.out.print(ans[k]+" ");
		}
//		
		
//		for(int i=0; i<arr.length; i++) {
//			ans[i]=-1;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]<arr[j]) {
//					ans[i]=arr[j];
//					break;
//				}
//			}
//		}
//		
//		for(int k=0;k<ans.length;k++) {
//			System.out.print(ans[k]+" ");
//		}

	}

}
