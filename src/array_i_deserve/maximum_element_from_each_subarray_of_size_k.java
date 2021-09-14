package array_i_deserve;

public class maximum_element_from_each_subarray_of_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,6,11,8,10,5,4,13,93,14};
		int k=4;
		for(int i=0; i<=arr.length-k; i++) {
			int max =arr[i];
			for(int j=i+1; j<i+4; j++) {
				if(max<arr[j]) {
					max=arr[j];
				}
			}
			System.out.print(max+ ", ");
		}

	}

}
