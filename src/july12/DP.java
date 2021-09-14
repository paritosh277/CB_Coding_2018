package july12;

import java.util.Arrays;
import java.util.Scanner;

public class DP {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();
		// int[] strg = new int[n + 1];
		// System.out.println(fibonacciRTD(n, strg));
		// System.out.println(fibonacciBottomUp(n));
		// System.out.println(fibonacciBUSE(n));

		// System.out.println(boardPathTD(0, 10, new int [11]));
		// System.out.println(boardPathBU(10));
		// System.out.println(mazePath(0,0,n,n,new int [n+1][n+1]));
		// System.out.println(mazePathBU(2, 2));
		// System.out.println(mazePathBUSE(3, 4));
		// System.out.println(LCS("abcd","agcfd"));
		// System.out.println(LCSBU("abcd","agcfd"));
		// System.out.println(EditDistance("abcd","agcfd"));

		// int[] arr = { 2,3,5,1,4 };
		// System.out.println(MCMTD(arr, 0, arr.length - 1, new
		// int[arr.length][arr.length]));
		// System.out.println(MCMBU(arr));

		// System.out.println(WineTD(arr, 0, arr.length-1 , new
		// int[arr.length][arr.length]));
		// System.out.println(WineBU(arr));

		// int[] weight = { 1, 3, 4, 5 };
		// int[] price = { 1, 4, 5, 7 };
		// int cap = 7;
		// System.out.println(KnapsackTD(weight, price, 0, cap, new
		// int[weight.length][cap + 1]));
		// System.out.println(KnapsackBU(weight, price, cap));

		int[] prices = { 0, 1, 5, 8, 9, 10, 17, 17, 20 };

		System.out.println(rodCutTD(prices, prices.length - 1, new int[prices.length]));
		System.out.println(rodCutBU(prices, prices.length - 1));

	}

	public static int fibonacciRTD(int n, int strg[]) {

		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}

		int fnm1 = fibonacciRTD(n - 1, strg);
		int fnm2 = fibonacciRTD(n - 2, strg);

		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

	public static int fibonacciBottomUp(int n) {
		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;

		for (int slide = 2; slide <= n; slide++) {
			int sum = strg[slide - 1] + strg[slide - 2];
			strg[slide] = sum;
		}
		return strg[n];
	}

	public static int fibonacciBUSE(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int slide = 1; slide <= n - 1; slide++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}

		return strg[1];
	}

	public static int boardPathTD(int curr, int end, int[] strg) {
		if (curr > end) {
			return 0;
		}

		if (curr == end) {
			return 1;
		}

		if (strg[curr] != 0) {
			return strg[curr];
		}

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += boardPathTD(curr + dice, end, strg);
		}
		strg[curr] = count;
		return count;
	}

	public static int boardPathBU(int n) {
		int[] strg = new int[n + 6];
		strg[n] = 1;
		for (int i = n - 1; i >= 0; i--) {
			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}
		return strg[0];
	}

	public static int boardPathBUSE(int n) {

		int[] strg = new int[6];
		return strg[0];
	}

	public static int mazePath(int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];

		}

		int hc = mazePath(cr, cc + 1, er, ec, strg);
		int vc = mazePath(cr + 1, cc, er, ec, strg);

		strg[cr][cc] = hc + vc;
		return hc + vc;
	}

	public static int mazePathBU(int er, int ec) {
		int[][] strg = new int[er + 1][ec + 1];
		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er || col == ec) {
					strg[row][col] = 1;
				} else {
					strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
				}
			}
		}

		return strg[0][0];
	}

	public static int mazePathBUSE(int er, int ec) {
		int[] strg = new int[ec + 1];

		Arrays.fill(strg, 1);
		for (int slide = er; slide > 0; slide--) {
			for (int col = ec; col >= 0; col--) {
				if (col == ec) {
					strg[col] = 1;
				} else {
					strg[col] = strg[col] + strg[col + 1];
				}
			}
		}

		return strg[0];
	}

	public static int LCS(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int c1 = LCS(ros1, s2);
			int c2 = LCS(s1, ros2);

			ans = Math.max(c1, c2);
		}

		return ans;
	}

	public static int LCSBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length() - 1; row >= 0; row--) {
			for (int col = s2.length() - 1; col >= 0; col--) {
				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = 1 + strg[row + 1][col + 1];
				} else {
					int c1 = strg[row][col + 1];
					int c2 = strg[row + 1][col];
					strg[row][col] = Math.max(c1, c2);
				}
			}
		}
		return strg[0][0];
	}

	public static int EditDistance(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {
			ans = EditDistance(ros1, ros2);
		} else {
			int i = EditDistance(ros1, ros2); // insertion
			int d = EditDistance(s1, ros2); // deletion
			int r = EditDistance(ros1, ros2); // replacement

			ans = (Math.min(r, Math.min(i, d))) + 1;
		}

		return ans;
	}

	// MCM-- Matrix Chain Multiplication
	public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {
		if (si + 1 == ei) {
			return 0;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int k = si + 1; k <= ei - 1; k++) {
			int fc = MCMTD(arr, si, k, strg);
			int sc = MCMTD(arr, k, ei, strg);
			int sw = arr[si] * arr[k] * arr[ei];
			int ans = fc + sc + sw;

			if (ans < min) {
				min = ans;
			}
		}

		strg[si][ei] = min;

		return min;
	}

	public static int MCMBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 1; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;

				if (si + 1 == ei) {

					strg[si][ei] = 0;

				} else {
					int min = Integer.MAX_VALUE;

					for (int k = si + 1; k <= ei - 1; k++) {
						int fc = strg[si][k];
						int sc = strg[k][ei];
						int sw = arr[si] * arr[k] * arr[ei];
						int ans = fc + sc + sw;

						if (ans < min) {
							min = ans;
						}
					}

					strg[si][ei] = min;
				}
			}
		}

		return strg[0][n - 1];
	}

	public static int WineTD(int[] arr, int si, int ei, int[][] strg) {
		int yr = arr.length - (ei - si);

		if (si == ei) {
			return arr[si] * yr;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int sc = WineTD(arr, si + 1, ei, strg) + arr[si] * yr;
		int lc = WineTD(arr, si, ei - 1, strg) + arr[ei] * yr;

		int ans = Math.max(sc, lc);
		strg[si][ei] = ans;

		return ans;

	}

	public static int WineBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		for (int slide = 0; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;
				int yr = n - (ei - si);
				if (si == ei) {
					strg[si][ei] = arr[si] * yr;
				} else {
					int sc = strg[si + 1][ei] + arr[si] * yr;
					int lc = strg[si][ei - 1] + arr[ei] * yr;

					int ans = Math.max(sc, lc);
					strg[si][ei] = ans;
				}
			}
		}
		return strg[0][n - 1];
	}

	public static int KnapsackTD(int[] weight, int[] prices, int vidx, int cap, int[][] strg) {
		if (vidx == weight.length) {
			return 0;
		}

		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}

		// exclude
		int exclude = KnapsackTD(weight, prices, vidx + 1, cap, strg);

		// include
		int include = 0;

		if (weight[vidx] <= cap) {
			include = KnapsackTD(weight, prices, vidx + 1, cap - weight[vidx], strg) + prices[vidx];
		}

		int ans = Math.max(include, exclude);
		strg[vidx][cap] = ans;

		return ans;
	}

	public static int KnapsackBU(int[] weight, int[] price, int cap) {
		int nr = weight.length + 1;
		int nc = cap + 1;
		int[][] strg = new int[nr][nc];
		for (int row = 1; row < nr; row++) {
			for (int col = 1; col < nc; col++) {
				int include = 0;
				if (col >= weight[row - 1]) {
					include = price[row - 1] + strg[row - 1][col - weight[row - 1]];
				}
				int exclude = strg[row - 1][col];

				int ans = Math.max(include, exclude);

				strg[row][col] = ans;

			}
		}

		return strg[nr - 1][nc - 1];
	}

	public static int Mixtures(int[] arr, int si, int ei) {
		int min = Integer.MAX_VALUE;
		for(int k=si; k<=ei-1;k++) {
			int fc = Mixtures(arr, si, k);
			int sc = 
		}
		
	}

	public static int rodCutTD(int[] prices, int n, int[] strg) {
		if (n == 0) {
			return 0;
		}

		if (strg[n] != 0) {
			return strg[n];
		}
		int left = 1;
		int right = n - 1;
		int max = prices[n];

		while (left <= right) {
			int fc = rodCutTD(prices, left, strg);
			int sc = rodCutTD(prices, right, strg);
			int ans = fc + sc;
			if (ans > max) {
				max = ans;
			}

			left++;
			right--;
		}
		strg[n] = max;
		return max;
	}

	public static int rodCutBU(int[] prices, int n) {

		int[] strg = new int[prices.length];

		for (int i = 0; i < strg.length; i++) {

			int left = 1;
			int right = i - 1;
			int max = prices[i];

			while (left <= right) {
				int fc = strg[left];
				int sc = strg[right];
				int ans = fc + sc;
				if (ans > max) {
					max = ans;
				}

				left++;
				right--;
			}
			strg[i] = max;

		}

		return strg[n];
	}

}
