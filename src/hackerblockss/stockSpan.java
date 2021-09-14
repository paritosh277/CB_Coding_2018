package hackerblockss;

import java.util.Scanner;
import java.util.Stack;

public class stockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] price = new int[n];
		for(int i=0; i<price.length; i++) {
			price[i]=scn.nextInt();
		}
		
		int[] span = new int[price.length];
//		Stack<Integer> st = new Stack<>();
//		
//		span[0]=1;
//		st.push(0);
//		int j=1;
//		while(j<price.length) {
//			if(st.isEmpty()) {
//				span[j]=j+1;
//				st.push(j);
//				j++;
//			}else if(price[st.peek()]>price[j]) {
//				span[j]=j-st.peek();
//				st.push(j);
//				j++;
//			}else if(price[st.peek()]<price[j]) {
//				st.pop();
//			}
//			
//		}
//		
//		
//		
		for(int i=0;i<span.length;i++) {
			span[i]=1;
		}
		for(int i=0; i<price.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(price[i]>=price[j]) {
					span[i]++;
				}else {
					break;
				}
			}
		}
		
		for(int k=0; k<span.length; k++) {
			System.out.print(span[k]+" ");
		}
		System.out.println("END");
		

	}

}
