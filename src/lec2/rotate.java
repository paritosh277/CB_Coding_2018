package lec2;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rot = scn.nextInt();
		int rem, sum = 0, count = 0;
		int temp = n, divisor, mul, quo, ans;
		while (temp > 0) {

			temp = temp / 10;
			count++;
		}

		rot = rot % count;
		if (rot < 0) {
			rot = rot + count;
		}
		
		divisor = (int) Math.pow(10, rot);
		rem = n % divisor;
		mul = (int) Math.pow(10, count - rot);
		rem = rem * mul;
		quo = n / divisor;
		ans = rem + quo;
		System.out.println(ans);

	}

}
