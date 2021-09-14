package june25;

import java.util.Scanner;

public class polynomial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(polynomial(x, n));
	}

	public static int polynomial(int x, int n) {
		int i;
		int sum = 0;
		int count = 1;
		int mult = x;
		for (i = n; i >= 1; i--) {
			sum = sum + i * mult;
			// count++;
			mult *= x;
		}
		return sum;
	}

}
