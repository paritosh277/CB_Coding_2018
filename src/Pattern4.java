import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i, j, k, l;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				if (j == i) {
					System.out.print(i);
				} else {
					System.out.print(i + "*");
				}
			}
			System.out.println();
		}

		for (k = n - 1; k >= 1; k--) {
			for (l = 1; l <= k; l++) {
				if (l == k) {
					System.out.print(k);
				} else {
					System.out.print(k + "*");
				}
			}
			System.out.println();
		}
	}

}
