package june18;

public class spiraldisplay2 {

	public static void main(String[] args) {
		int[][] arr = {{11,12,13,14}, {21,22,23,24}, {31,32,33,34}, {41,42,43,44}};
		int minRow = 0;
		int maxRow = arr.length-1;
		int minCol = 0;
		int maxCol = arr[0].length-1;
		int counter = 0;
		int nel = arr.length * arr[0].length;
		
		while(counter < nel) {
			//first row
			for(int col = minCol; col <= maxCol; col++) {
				System.out.print(arr[minRow][col]+"\t");
				counter++;
			}
			minRow++;
			
			//last col
			for(int row = minRow; row <= maxRow; row++) {
				System.out.print(arr[row][maxCol]+"\t");
				counter++;
			}
			maxCol--;
			
			//last row
			for(int col = maxCol; col >= minCol; col--) {
				System.out.print(arr[maxRow][col]+"\t");
				counter++;
			}
			maxRow--;
			
			//first col
			for(int row = maxRow; row >= minRow; row--) {
				System.out.println(arr[row][minCol]+"\t");
				counter++;
			}
			minCol++;
		}

	}

}
