package june25;

public class find_all_index {

	public static void main(String[] args) {
		int[] arr= {20,30,10,20,20,40,20};
		int item=20;
		System.out.println(findAllIndex(arr,0,20,0));

	}
	
	public static int[] findAllIndex(int[] arr, int vidx, int item, int count) {
		if(vidx==arr.length) {
			int[]br = new int[count];
			return br;
		}
		
		if(arr[vidx]==item) {
			int[] rr = findAllIndex(arr,vidx+1,item,count+1);
			rr[count]=vidx;
			return rr;
		}else {
			int[] rr= findAllIndex(arr, vidx+1, item, count);
			return rr;
		}
	}

}
