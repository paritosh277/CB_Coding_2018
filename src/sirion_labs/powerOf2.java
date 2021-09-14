package sirion_labs;

import java.util.Scanner;

public class powerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x=0;
		int j=1;
		int status=0;
		while(x<n) {
			x=(int)Math.pow(2, j);
			if(x==n) {
				status=1;
				break;
			}
			j++;
		}
		if(status==1) {
			System.out.println("Yes Power of 2 ");
		}else {
			System.out.println("Not Power of 2 ");
		}
		
	}

}
