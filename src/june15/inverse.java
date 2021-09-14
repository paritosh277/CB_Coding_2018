package june15;

public class inverse {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 3, 0, 4 };
		int[] arr2 = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

	}

}
