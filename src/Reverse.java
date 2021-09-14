import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = 0;
		int remainder = 0;
		while (num > 0) {
			remainder = num % 10;
			sum = sum * 10 + remainder;
			num = num / 10;
		}

		System.out.println(sum);

	}

}
