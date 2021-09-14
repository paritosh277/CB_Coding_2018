package hackerblockss;

public class recursionFindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {44,33,55,22,11};
		System.out.println(recMax(arr, arr[0], 1));

	}
	
	public static int recMax(int[] arr, int max, int i) {
		if(i==arr.length) {
			return max;
		}
		
		if(max<arr[i]) {
			max = arr[i];
		}
		
		return recMax(arr, max, i+1);
		
	}
	

}
