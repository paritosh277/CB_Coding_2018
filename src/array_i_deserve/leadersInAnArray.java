package array_i_deserve;

public class leadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {98,23,54,12,20,7,27};
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]<arr[j]) {
//					break;
//				}else if(j==arr.length-1) {
//					System.out.print(arr[i]+" ");
//				}
//			}
//		}
//		System.out.print(arr[arr.length-1]);
		int currentLeader=arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>=currentLeader) {
				System.out.print(arr[i]+" ");
				currentLeader=arr[i];
			}
		}
	}

}
