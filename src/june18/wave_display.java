package june18;

public class wave_display {

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
		
		
		for(int col=0;col<arr[0].length;col++) {
			if(col%2 == 0) {
				for(int row=0;row<arr.length;row++) {
					System.out.print(arr[row][col]+"\t");
				}
			}else {
				for(int row=arr.length-1;row>=0; row--) {
					System.out.print(arr[row][col]+"\t");
				}
			}
			
			System.out.println();
			
		}	

	}

}
