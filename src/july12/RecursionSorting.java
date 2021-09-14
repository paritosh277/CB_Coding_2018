package july12;

public class RecursionSorting {

	public static void main(String[] args) {
		int arr[] = { 20, 10, 5, 16, 18, 3, 4, 50 };

		// int ans[] = mergeSort(arr, 0, arr.length - 1);

		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] mergeTwoSortedArrays(int[] one, int[] second) {
		int[] third = new int[one.length + second.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < second.length) {
			if (one[i] > second[j]) {
				third[k] = second[j];
				k++;
				j++;
			}

			else {
				third[k] = one[i];
				k++;
				i++;
			}
		}

		if (i == one.length) {
			while (j < second.length) {
				third[k] = second[j];
				k++;
				j++;
			}
		}

		if (j == second.length) {
			while (i < one.length) {
				third[k] = one[i];
				k++;
				i++;
			}
		}

		return third;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		int mid = (lo + hi) / 2;

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int fh[] = mergeSort(arr, lo, mid);
		int sh[] = mergeSort(arr, mid + 1, hi);

		return mergeTwoSortedArrays(fh, sh);
	}

	public static void quickSort(int[] arr, int left, int right) {

		if (left >= right)
			return;

		int lo = left;
		int hi = right;
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];

		while (lo <= hi) {
			while (arr[lo] < pivot) {
				lo++;
			}

			while (arr[hi] > pivot) {
				hi--;
			}

			if (lo <= hi) {
				int temp = arr[lo];
				arr[lo] = arr[hi];
				arr[hi] = temp;

				lo++;
				hi--;
			}

		}

		quickSort(arr, left, hi);
		quickSort(arr, lo, right);
	}
}
