package june18;

public class vertical_display {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4,17},{5,6,7,8,13},{9,10,11,12,19},{13,14,15,16,20},{21,22,23,24,25}};
		int[][] arr2= new int[10][10];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println( );
		}
		System.out.println( );
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j< arr[i].length;j++) {
				arr2[j][i]=arr[i][j];
			}
		
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println( );
		}
	}

}
