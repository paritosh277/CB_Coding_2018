package hackerblockss;

public class spiralDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24},{31,32,33,34}, {41,42,43,44}};
		int minRow = 0;
		int maxRow = arr.length-1;
		int minCol = 0;
		int maxCol = arr[0].length-1;
		int nel = arr.length * arr[0].length;
		int counter=0;
		
		while(counter<nel) {
			//first row
			for(int col=minCol; col<=maxCol; col++) {
				System.out.print(arr[minRow][col] + " ");
				counter++;
			}
			minRow++;
			
			//last col
			for(int row=minRow; row<=maxRow; row++) {
				System.out.print(arr[row][maxCol] + " ");
				counter++;
			}
			maxCol--;
			
			//last row
			for(int col=maxCol; col>=minCol; col--) {
				System.out.print(arr[maxRow][col] + " ");
				counter++;
			}
			maxRow--;
			
			//first col
			for(int row=maxRow; row>=minRow; row--) {
				System.out.print(arr[row][minCol]+ " ");
				counter++;
			}
			minCol++;
		}

	}

}
