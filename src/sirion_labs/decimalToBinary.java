package sirion_labs;

import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		int ans = 0;
		int rem;
		int mul =1;
		Scanner scn = new Scanner(System.in);
		int sum = scn.nextInt();
		while(sum!=0) {
			rem = sum%2;
			ans = ans + rem * mul;
			mul = mul * 10;
			sum = sum/2;
		}
		System.out.println(ans);

	}

}
