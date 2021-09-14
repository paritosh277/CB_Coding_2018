import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 2, count = 0;
		while (i <= n) {
			if (n % i == 0) {
				count = count + 1;
			}
			i = i + 1;
		}

		if (count == 1) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " is not prime");
		}

	}

}
