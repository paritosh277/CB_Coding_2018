package june25;

public class find_max_using_recursion {

	public static void main(String[] args) {
		int[] arr = {10,200,30,400,50};
		System.out.println(max(arr,0));
	}
	
	public static int max(int[] arr, int vidx) {
		if(vidx==arr.length) {
			return Integer.MIN_VALUE;
		}
		
		
		int rr=max(arr,vidx+1);
		
		if(arr[vidx]>rr) {
			return arr[vidx];
		}else {
			return rr;
		}
	}

}
