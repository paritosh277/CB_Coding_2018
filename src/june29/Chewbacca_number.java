package june29;

import java.util.Scanner;

public class Chewbacca_number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int ans=0;
		int rem;
		int z;
		int count=0;
		while(x>0) {
			rem=x%10;
			z=rem;
			if((9-z)<z) {
				rem=9-z;
			}
			ans = ans + rem * (int)Math.pow(10, count);
			x=x/10;
			count++;
			
			
		}
		
		System.out.println(ans);
		

	}

}
