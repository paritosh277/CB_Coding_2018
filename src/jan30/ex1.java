package jan30;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the source number");
		int snum = scn.nextInt();
		System.out.println("Enter the source base number");
		int sb = scn.nextInt();
		int ans = anybaseToDecimal(snum, sb);
		System.out.println(ans);
		

	}
	
	public static int anybaseToDecimal(int snum, int sb){
		int mul=1;
		int ans=0;
		while(snum!=0) {
			int rem = snum % 10;
			ans = ans+rem* mul;
			mul=mul*sb;
			snum = snum/10;
		}
		return ans;
		
	}

}
