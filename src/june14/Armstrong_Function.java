package june14;

import java.util.Scanner;

public class Armstrong_Function {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ll = scn.nextInt();
		int ul = scn.nextInt();
		printAllArmstrong(ll,ul);
	}
	
	public static int numberOfDigits(int num) {
		int count=0,rem;
		while(num>0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
	
	public static void printAllArmstrong(int ll, int ul) {
		
		for(int i=ll ; i<=ul; i++) {
			int nod = numberOfDigits(i);
			if(isArmstrong(i,nod)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isArmstrong(int num, int nod) {
		int onum=num;
		int ans=0,rem;
		while(num>0) {
			rem=num%10;
			ans=ans + (int) Math.pow(rem,nod);
			num=num/10;
		}
		
		if(ans==onum) {
			return true; 
		}else {
			return false;
		}
		
	}

}
