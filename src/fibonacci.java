import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[];
		a = new int[100];
		int i = 2;
		a[0] = 0;
		a[1] = 1;
		while (i <= n) {
			a[i] = a[i - 1] + a[i - 2];
			i = i + 1;
		}

		System.out.println(a[n]);

	}

}
