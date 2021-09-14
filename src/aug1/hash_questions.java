package aug1;

import java.util.ArrayList;
import java.util.HashMap;

public class hash_questions {

	public static void main(String[] args) {

		int[] arr = { 8, 9, 10, 11, 12, 4, 5, 3, 1, 2, 6 };
		System.out.println(longestConsecutive(arr));
	}

	public static ArrayList<Integer> longestConsecutive(int[] arr) {
		HashMap<Integer, Boolean> kmap = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			int vm1 = arr[i] - 1;
			if (kmap.containsKey(vm1)) {
				kmap.put(val, false);
			} else {
				kmap.put(val, true);
			}

			int np1 = val + 1;

			if (kmap.containsKey(np1)) {
				kmap.put(np1, false);
			}

		}

		int maxlength = 0;
		int sequenceStarting = 0;

		for (int i = 0; i < arr.length; i++) {

			if (kmap.get(arr[i])) {

				int count = 0;

				while (kmap.containsKey(arr[i] + count)) {
					count++;
				}

				if (count > maxlength) {
					maxlength = count;
					sequenceStarting = arr[i];
				}

			}
		}

		for (int i = 0; i < maxlength; i++) {
			ans.add(i + sequenceStarting);
		}

		return ans;
	}

}
