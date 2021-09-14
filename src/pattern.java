import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i, j, k, l;
		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (k = 1; k <= n + 1 - i; k++) {
				System.out.print("*");
			}

			for (l = 1; l < n + 1 - i; l++) {
				System.out.print("*");
			}

			System.out.println(" ");
		}

	}

}
