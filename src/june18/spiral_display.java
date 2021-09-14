package june18;

public class spiral_display {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4,17},{5,6,7,8,13},{9,10,11,12,19},{13,14,15,16,20},{21,22,23,24,25}};
		int minRow=0;
		int maxRow=arr.length-1;
		int minCol=0;
		int maxCol=arr[0].length-1;
		int counter=0;
		int nel=arr.length * arr[0].length;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println( );
		}
		System.out.println( );
		
		while(counter<nel) {
			
			//col
			for(int row=minRow;row<=maxRow&&counter<nel;row++) {
				System.out.print(arr[row][minCol]+"\t");
				counter++;
			}
			minCol++;
			
			//last row
			for(int col=minCol; col<=maxCol; col++) {
				System.out.print(arr[maxRow][col]+"\t");
				counter++;
			}
			maxRow--;
			
			//last col
			for(int row=maxRow; row>=minRow; row--) {
				System.out.print(arr[row][maxCol]+"\t");
				counter++;
			}
			maxCol--;
			
			//first row
			for(int col=maxCol; col>=minCol; col--) {
				System.out.print(arr[minRow][col]+"\t");
				counter++;
			}
			minRow++;
			
			
		}

	}

}
