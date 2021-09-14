package fundamentalsandpatterns;

import java.util.Scanner;

public class vonNeumanLovesBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			binaryToDecimal(n);
		}
		

	}
	
	public static void binaryToDecimal(int n) {
		int multiplier=1;
		int ans=0;
		while(n!=0) {
			int rem = n %10;
			ans = ans + rem*multiplier;
			multiplier=multiplier*2;
			n=n/10;
		}
		System.out.println(ans);
	}

}
