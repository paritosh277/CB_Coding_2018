package june25;

import java.util.Scanner;

public class find_start_index {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 40, 20 };
		Scanner scn = new Scanner(System.in);
		int item = scn.nextInt();
		System.out.println(findFirstIndex(arr, 0, 20));

	}

	public static int findFirstIndex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}

		int rr = findFirstIndex(arr, vidx + 1, item);
		if (arr[vidx] == item) {
			return vidx;
		} else {
			return rr;
		}
	}

}
