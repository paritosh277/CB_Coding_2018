package june15;

import java.util.Scanner;

public class print_series {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int count = 1,n=1;
		while(count<=n1) {
			if(((3*n+2) % n2)!=0) {
				System.out.println(3*n+2);
				count++;
			}
			n++;
		}

	}

}
