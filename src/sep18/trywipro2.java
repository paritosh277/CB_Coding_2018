package sep18;

import java.util.Scanner;

public class trywipro2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[][] = {{1,1,1,1},{1,1,0,0},{1,0,0,0},{1,1,0,0}};
		int count=0, temp,row=0;
		temp=count;
		for(int i=0; i<a.length;i++) {
			count=0;
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]==0) {
					count++;
					
				}
			}
			if(count>temp) {
				temp=count;
				row=i;
			}
			
			
		}
		
		System.out.println(row);

	}

}
