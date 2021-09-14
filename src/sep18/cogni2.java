package sep18;

import java.util.Scanner;

public class cogni2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i, j, isPrime;
		
		for(i=2; i<=n; i++) {
			isPrime=1;
			if(n %i ==0) {
				
				for(j=2;j<i;j++) {
					if(i%j ==0) {
						isPrime=0;
						break;
					}
				}
				if(isPrime==1) {
					System.out.println(i);
				}
			}
		}

	}

}
