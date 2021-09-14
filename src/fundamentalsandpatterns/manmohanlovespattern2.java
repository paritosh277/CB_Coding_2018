package fundamentalsandpatterns;

import java.util.Scanner;

public class manmohanlovespattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample Input
//		5
//		Sample Output
//		1
//		11
//		202
//		3003
//		40004	
		
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i==1) {
					System.out.print("1"+ " ");
				}else if(j==1 || j==i) {
					System.out.print(i-1+" ");
				}else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}

	}

}
