import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int n = num1;
		while (n > 0) {
			if ((num1 % n == 0) && (num2 % n == 0)) {
				break;
			}
			n = n - 1;

		}
		System.out.println("gcd is " + n);

	}

}
