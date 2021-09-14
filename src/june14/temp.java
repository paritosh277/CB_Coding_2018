package june14;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int min = scn.nextInt();
		int max = scn.nextInt();
		int step = scn.nextInt();
		int i,c;
		for(i=min;i<=max;i+=step) {
			c=(int)((5.0/9)*(i - 32));
			System.out.println(i + "\t" + c);
			
		}
		
	}

}
