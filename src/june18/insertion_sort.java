package june18;

public class insertion_sort {

	public static void main(String[] args) {
		int[] arr={10,5,7,6,4};
		insertionSort(arr);
	}
	
	public static void insertionSort(int[] arr) {
		
		for(int counter=1;counter<=arr.length-1;counter++) {
			int item=arr[counter];
			int j = counter-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=item;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
