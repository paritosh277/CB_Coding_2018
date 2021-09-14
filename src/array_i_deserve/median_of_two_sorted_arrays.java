package array_i_deserve;

public class median_of_two_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,5,11,17};
		int arr2[]= {9,10,11,13,14};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int[] arr3 = new int[len1+len2];
		
		int i=0;
		int j=0;
		int k=0;
		while(i<len1 && j<len2) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				k++;
				i++;
			}else {
				arr3[k]=arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<len1) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<len2) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		
		System.out.println(arr3[(arr3.length-1)/2]);
		

	}

}
